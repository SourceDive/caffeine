/*
 * 最简单的 Caffeine Cache 测试案例
 * 作为阅读源码的入口
 */
package com.github.benmanes.caffeine.my_debug;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.github.benmanes.caffeine.cache.LoadingCache;
import com.github.benmanes.caffeine.cache.stats.CacheStats;

/**
 * 最简单的测试案例，用于理解 Caffeine 的基本工作原理
 * <p>
 * 这个测试展示了：
 * 1. 如何创建一个简单的 Cache
 * 2. 基本的 put/get 操作
 * 3. 如何查看缓存统计信息
 * <p>
 * 建议阅读顺序：
 * 1. Caffeine.newBuilder() - 查看构建器模式
 * 2. cache.put() - 查看数据如何存储
 * 3. cache.getIfPresent() - 查看数据如何获取
 * 4. cache.stats() - 查看统计信息如何收集
 */
public class SimpleCacheTest {

    public static void main(String[] args) {
        System.out.println("=== 最简单的 Caffeine Cache 测试 ===\n");

        // 1. 创建一个简单的 Cache
        // 可以在这里打断点，进入 Caffeine.newBuilder() 查看构建过程
        Cache<String, String> cache = Caffeine.newBuilder()
                .maximumSize(10)  // 最大容量为 10
                .recordStats()     // 启用统计信息
                .build();

        System.out.println("1. Cache 创建完成");
        System.out.println("   当前缓存大小: " + cache.estimatedSize());

        // 2. 存储数据
        // 可以在这里打断点，进入 cache.put() 查看存储逻辑
        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");

        System.out.println("\n2. 存储了 3 个键值对");
        System.out.println("   当前缓存大小: " + cache.estimatedSize());

        // 3. 获取数据
        // 可以在这里打断点，进入 cache.getIfPresent() 查看获取逻辑
        String value1 = cache.getIfPresent("key1");
        String value2 = cache.getIfPresent("key2");
        String valueNotFound = cache.getIfPresent("notExist");

        System.out.println("\n3. 获取数据:");
        System.out.println("   key1 -> " + value1);
        System.out.println("   key2 -> " + value2);
        System.out.println("   notExist -> " + valueNotFound);

        // 4. 查看统计信息
        // 可以在这里打断点，进入 cache.stats() 查看统计逻辑
        CacheStats stats = cache.stats();
        System.out.println("\n4. 缓存统计信息:");
        System.out.println("   命中次数: " + stats.hitCount());
        System.out.println("   未命中次数: " + stats.missCount());
        System.out.println("   命中率: " + String.format("%.2f%%", stats.hitRate() * 100));

        // 5. 测试 LoadingCache（自动加载）
        System.out.println("\n5. 测试 LoadingCache（自动加载）:");
        LoadingCache<String, String> loadingCache = Caffeine.newBuilder()
                .maximumSize(10)
                .build(key -> {
                    // 当缓存中不存在时，会自动调用这个函数加载数据
                    System.out.println("   自动加载: " + key);
                    return "loaded_" + key;
                });

        // 第一次获取，会触发自动加载
        String loadedValue = loadingCache.get("autoKey");
        System.out.println("   获取 autoKey: " + loadedValue);

        // 第二次获取，直接从缓存中获取
        String cachedValue = loadingCache.get("autoKey");
        System.out.println("   再次获取 autoKey: " + cachedValue);

        System.out.println("\n=== 测试完成 ===");
        System.out.println("\n提示：可以在上述关键位置打断点，深入阅读源码");
    }
}

