// Copyright 2025 Ben Manes. All Rights Reserved.
package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.base.UnsafeAccess;
import com.github.benmanes.caffeine.cache.References.LookupKeyReference;
import com.github.benmanes.caffeine.cache.References.SoftValueReference;
import com.github.benmanes.caffeine.cache.References.WeakKeyReference;
import com.github.benmanes.caffeine.cache.References.WeakValueReference;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Objects;

/**
 * <em>WARNING: GENERATED CODE</em>
 *
 * A factory for cache nodes optimized for a particular configuration.
 *
 * @author ben.manes@gmail.com (Ben Manes)
 */
@SuppressWarnings("unchecked")
enum NodeFactory {
  SSo {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSo<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSo<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoA<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSoWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSoWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SSt {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSt<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SSt<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStA<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SStWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SStWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWA<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  SWWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new SWWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }
  },

  WSo {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSo<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSo<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoA<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSoWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSoWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WSt {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSt<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WSt<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStA<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WStWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WStWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWA {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWA<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWA<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWARMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWARMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWARMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWARMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWARMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWARMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWAWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWAWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWWMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWWMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWWR {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWR<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWWRMS {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWRMS<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWRMS<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  },

  WWWRMW {
    <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWRMW<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      return new WWWRMW<>(keyReference, value, valueReferenceQueue, weight, now);
    }

    <K> Object newLookupKey(K key) {
      return new LookupKeyReference<K>(key);
    }

    <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
      return new WeakKeyReference<K>(key, referenceQueue);
    }
  };

  private static final Object RETIRED_STRONG_KEY = State.RETIRED;

  private static final Object DEAD_STRONG_KEY = State.DEAD;

  private static final WeakKeyReference<Object> RETIRED_WEAK_KEY = new WeakKeyReference<Object>(RETIRED_STRONG_KEY, null);

  private static final WeakKeyReference<Object> DEAD_WEAK_KEY = new WeakKeyReference<Object>(DEAD_STRONG_KEY, null);

  /**
   * Returns a node optimized for the specified features.
   */
  abstract <K, V> Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now);

  /**
   * Returns a node optimized for the specified features.
   */
  abstract <K, V> Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now);

  /**
   * Returns a key suitable for looking up an entry in the cache. If the cache holds keys strongly
   * then the key is returned. If the cache holds keys weakly then a {@link LookupKeyReference<K>}
   * holding the key argument is returned.
   */
  <K> Object newLookupKey(K key) {
    return key;
  }

  /**
   * Returns a key suitable for inserting into the cache. If the cache holds keys strongly then
   * the key is returned. If the cache holds keys weakly then a {@link WeakKeyReference<K>}
   * holding the key argument is returned.
   */
  <K> Object newReferenceKey(K key, ReferenceQueue<K> referenceQueue) {
    return key;
  }

  /**
   * Returns whether this factory supports the weak values.
   */
  boolean weakValues() {
    return name().matches(".W.*");
  }

  /**
   * Returns whether this factory supports the soft values.
   */
  boolean softValues() {
    return name().matches(".So.*");
  }

  /**
   * Returns a factory optimized for the specified features.
   */
  static NodeFactory getFactory(boolean strongKeys, boolean weakKeys, boolean strongValues, boolean weakValues, boolean softValues, boolean expiresAfterAccess, boolean expiresAfterWrite, boolean refreshAfterWrite, boolean maximumSize, boolean weighed) {
    StringBuilder sb = new StringBuilder();
    if (strongKeys) {
      sb.append('S');
    } else{
      sb.append('W');
    }
    if (strongValues) {
      sb.append("St");
    } else if (weakValues){
      sb.append('W');
    } else{
      sb.append("So");
    }
    if (expiresAfterAccess) {
      sb.append('A');
    }
    if (expiresAfterWrite) {
      sb.append('W');
    }
    if (refreshAfterWrite) {
      sb.append('R');
    }
    if (maximumSize) {
      sb.append('M');
      if (weighed) {
        sb.append('W');
      } else{
        sb.append('S');
      }
    }
    return valueOf(sb.toString());
  }

  private enum State {
    RETIRED,

    DEAD
  }

  static class SSo<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(SSo.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(SSo.class, "value");

    protected volatile K key;

    protected volatile SoftValueReference<V> value;

    SSo(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = key;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(this.key, value, valueReferenceQueue));
    }

    SSo(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (K) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(this.key, value, valueReferenceQueue));
    }

    public final K getKey() {
      return (K) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return ((Reference<V>) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET)).get();
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(key, value, referenceQueue));
    }

    public final boolean containsValue(Object value) {
      return getValue() == value;
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_STRONG_KEY) && (key != DEAD_STRONG_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_STRONG_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_STRONG_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_STRONG_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_STRONG_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class SSoA<K, V> extends SSo<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SSoA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    SSoA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SSoAMS<K, V> extends SSoA<K, V> {
    SSoAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SSoAMW<K, V> extends SSoA<K, V> {
    protected int weight;

    SSoAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SSoAR<K, V> extends SSoA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SSoAR.class, "writeTime");

    protected volatile long writeTime;

    SSoAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SSoAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SSoARMS<K, V> extends SSoAR<K, V> {
    SSoARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SSoARMW<K, V> extends SSoAR<K, V> {
    protected int weight;

    SSoARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SSoAW<K, V> extends SSoA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SSoAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SSoAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SSoAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SSoAWMS<K, V> extends SSoAW<K, V> {
    SSoAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SSoAWMW<K, V> extends SSoAW<K, V> {
    protected int weight;

    SSoAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SSoAWR<K, V> extends SSoAW<K, V> {
    SSoAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SSoAWRMS<K, V> extends SSoAWR<K, V> {
    SSoAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SSoAWRMW<K, V> extends SSoAWR<K, V> {
    protected int weight;

    SSoAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class SSoMS<K, V> extends SSo<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SSoMW<K, V> extends SSo<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SSoR<K, V> extends SSo<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SSoR.class, "writeTime");

    protected volatile long writeTime;

    SSoR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SSoR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SSoRMS<K, V> extends SSoR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SSoRMW<K, V> extends SSoR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SSoW<K, V> extends SSo<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SSoW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SSoW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SSoW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SSoWMS<K, V> extends SSoW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SSoWMW<K, V> extends SSoW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SSoWR<K, V> extends SSoW<K, V> {
    SSoWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SSoWRMS<K, V> extends SSoWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SSoWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SSoWRMW<K, V> extends SSoWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SSoWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SSoWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SSt<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(SSt.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(SSt.class, "value");

    protected volatile K key;

    protected volatile V value;

    SSt(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = key;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    SSt(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (K) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    public final K getKey() {
      return (K) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return (V) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET);
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    public final boolean containsValue(Object value) {
      return Objects.equals(value, getValue());
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_STRONG_KEY) && (key != DEAD_STRONG_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_STRONG_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_STRONG_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_STRONG_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_STRONG_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class SStA<K, V> extends SSt<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SStA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    SStA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SStAMS<K, V> extends SStA<K, V> {
    SStAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SStAMW<K, V> extends SStA<K, V> {
    protected int weight;

    SStAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SStAR<K, V> extends SStA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SStAR.class, "writeTime");

    protected volatile long writeTime;

    SStAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SStAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SStARMS<K, V> extends SStAR<K, V> {
    SStARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SStARMW<K, V> extends SStAR<K, V> {
    protected int weight;

    SStARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SStAW<K, V> extends SStA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SStAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SStAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SStAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SStAWMS<K, V> extends SStAW<K, V> {
    SStAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SStAWMW<K, V> extends SStAW<K, V> {
    protected int weight;

    SStAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SStAWR<K, V> extends SStAW<K, V> {
    SStAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SStAWRMS<K, V> extends SStAWR<K, V> {
    SStAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SStAWRMW<K, V> extends SStAWR<K, V> {
    protected int weight;

    SStAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class SStMS<K, V> extends SSt<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SStMW<K, V> extends SSt<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SStR<K, V> extends SSt<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SStR.class, "writeTime");

    protected volatile long writeTime;

    SStR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SStR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SStRMS<K, V> extends SStR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SStRMW<K, V> extends SStR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SStW<K, V> extends SSt<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SStW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SStW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SStW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SStWMS<K, V> extends SStW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SStWMW<K, V> extends SStW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SStWR<K, V> extends SStW<K, V> {
    SStWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SStWRMS<K, V> extends SStWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SStWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SStWRMW<K, V> extends SStWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SStWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SStWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SW<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(SW.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(SW.class, "value");

    protected volatile K key;

    protected volatile WeakValueReference<V> value;

    SW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = key;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(this.key, value, valueReferenceQueue));
    }

    SW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (K) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(this.key, value, valueReferenceQueue));
    }

    public final K getKey() {
      return (K) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return ((Reference<V>) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET)).get();
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(key, value, referenceQueue));
    }

    public final boolean containsValue(Object value) {
      return getValue() == value;
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_STRONG_KEY) && (key != DEAD_STRONG_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_STRONG_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_STRONG_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_STRONG_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_STRONG_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class SWA<K, V> extends SW<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SWA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    SWA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SWAMS<K, V> extends SWA<K, V> {
    SWAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SWAMW<K, V> extends SWA<K, V> {
    protected int weight;

    SWAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SWAR<K, V> extends SWA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SWAR.class, "writeTime");

    protected volatile long writeTime;

    SWAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SWAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SWARMS<K, V> extends SWAR<K, V> {
    SWARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SWARMW<K, V> extends SWAR<K, V> {
    protected int weight;

    SWARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SWAW<K, V> extends SWA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SWAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SWAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SWAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SWAWMS<K, V> extends SWAW<K, V> {
    SWAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SWAWMW<K, V> extends SWAW<K, V> {
    protected int weight;

    SWAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class SWAWR<K, V> extends SWAW<K, V> {
    SWAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SWAWRMS<K, V> extends SWAWR<K, V> {
    SWAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class SWAWRMW<K, V> extends SWAWR<K, V> {
    protected int weight;

    SWAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class SWMS<K, V> extends SW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SWMW<K, V> extends SW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SWR<K, V> extends SW<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SWR.class, "writeTime");

    protected volatile long writeTime;

    SWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SWRMS<K, V> extends SWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SWRMW<K, V> extends SWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SWW<K, V> extends SW<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(SWW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    SWW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    SWW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class SWWMS<K, V> extends SWW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SWWMW<K, V> extends SWW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class SWWR<K, V> extends SWW<K, V> {
    SWWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class SWWRMS<K, V> extends SWWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    SWWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class SWWRMW<K, V> extends SWWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    SWWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    SWWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WSo<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(WSo.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(WSo.class, "value");

    protected volatile WeakKeyReference<K> key;

    protected volatile SoftValueReference<V> value;

    WSo(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = new WeakKeyReference<K>(key, keyReferenceQueue);
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(this.key, value, valueReferenceQueue));
    }

    WSo(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (WeakKeyReference<K>) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(this.key, value, valueReferenceQueue));
    }

    public final K getKey() {
      return ((Reference<K>) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET)).get();
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return ((Reference<V>) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET)).get();
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new SoftValueReference<V>(key, value, referenceQueue));
    }

    public final boolean containsValue(Object value) {
      return getValue() == value;
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_WEAK_KEY) && (key != DEAD_WEAK_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_WEAK_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_WEAK_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_WEAK_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_WEAK_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class WSoA<K, V> extends WSo<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WSoA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    WSoA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WSoAMS<K, V> extends WSoA<K, V> {
    WSoAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WSoAMW<K, V> extends WSoA<K, V> {
    protected int weight;

    WSoAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WSoAR<K, V> extends WSoA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WSoAR.class, "writeTime");

    protected volatile long writeTime;

    WSoAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WSoAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WSoARMS<K, V> extends WSoAR<K, V> {
    WSoARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WSoARMW<K, V> extends WSoAR<K, V> {
    protected int weight;

    WSoARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WSoAW<K, V> extends WSoA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WSoAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WSoAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WSoAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WSoAWMS<K, V> extends WSoAW<K, V> {
    WSoAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WSoAWMW<K, V> extends WSoAW<K, V> {
    protected int weight;

    WSoAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WSoAWR<K, V> extends WSoAW<K, V> {
    WSoAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WSoAWRMS<K, V> extends WSoAWR<K, V> {
    WSoAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WSoAWRMW<K, V> extends WSoAWR<K, V> {
    protected int weight;

    WSoAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class WSoMS<K, V> extends WSo<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WSoMW<K, V> extends WSo<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WSoR<K, V> extends WSo<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WSoR.class, "writeTime");

    protected volatile long writeTime;

    WSoR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WSoR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WSoRMS<K, V> extends WSoR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WSoRMW<K, V> extends WSoR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WSoW<K, V> extends WSo<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WSoW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WSoW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WSoW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WSoWMS<K, V> extends WSoW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WSoWMW<K, V> extends WSoW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WSoWR<K, V> extends WSoW<K, V> {
    WSoWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WSoWRMS<K, V> extends WSoWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WSoWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WSoWRMW<K, V> extends WSoWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WSoWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WSoWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WSt<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(WSt.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(WSt.class, "value");

    protected volatile WeakKeyReference<K> key;

    protected volatile V value;

    WSt(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = new WeakKeyReference<K>(key, keyReferenceQueue);
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    WSt(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (WeakKeyReference<K>) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    public final K getKey() {
      return ((Reference<K>) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET)).get();
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return (V) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET);
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, value);
    }

    public final boolean containsValue(Object value) {
      return Objects.equals(value, getValue());
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_WEAK_KEY) && (key != DEAD_WEAK_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_WEAK_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_WEAK_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_WEAK_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_WEAK_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class WStA<K, V> extends WSt<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WStA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    WStA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WStAMS<K, V> extends WStA<K, V> {
    WStAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WStAMW<K, V> extends WStA<K, V> {
    protected int weight;

    WStAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WStAR<K, V> extends WStA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WStAR.class, "writeTime");

    protected volatile long writeTime;

    WStAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WStAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WStARMS<K, V> extends WStAR<K, V> {
    WStARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WStARMW<K, V> extends WStAR<K, V> {
    protected int weight;

    WStARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WStAW<K, V> extends WStA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WStAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WStAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WStAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WStAWMS<K, V> extends WStAW<K, V> {
    WStAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WStAWMW<K, V> extends WStAW<K, V> {
    protected int weight;

    WStAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WStAWR<K, V> extends WStAW<K, V> {
    WStAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WStAWRMS<K, V> extends WStAWR<K, V> {
    WStAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WStAWRMW<K, V> extends WStAWR<K, V> {
    protected int weight;

    WStAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class WStMS<K, V> extends WSt<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WStMW<K, V> extends WSt<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WStR<K, V> extends WSt<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WStR.class, "writeTime");

    protected volatile long writeTime;

    WStR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WStR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WStRMS<K, V> extends WStR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WStRMW<K, V> extends WStR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WStW<K, V> extends WSt<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WStW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WStW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WStW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WStWMS<K, V> extends WStW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WStWMW<K, V> extends WStW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WStWR<K, V> extends WStW<K, V> {
    WStWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WStWRMS<K, V> extends WStWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WStWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WStWRMW<K, V> extends WStWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WStWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WStWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WW<K, V> implements Node<K, V> {
    protected static final long KEY_OFFSET = UnsafeAccess.objectFieldOffset(WW.class, "key");

    protected static final long VALUE_OFFSET = UnsafeAccess.objectFieldOffset(WW.class, "value");

    protected volatile WeakKeyReference<K> key;

    protected volatile WeakValueReference<V> value;

    WW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = new WeakKeyReference<K>(key, keyReferenceQueue);
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(this.key, value, valueReferenceQueue));
    }

    WW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      this.key = (WeakKeyReference<K>) keyReference;
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(this.key, value, valueReferenceQueue));
    }

    public final K getKey() {
      return ((Reference<K>) UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET)).get();
    }

    public final Object getKeyReference() {
      return UnsafeAccess.UNSAFE.getObject(this, KEY_OFFSET);
    }

    public final V getValue() {
      return ((Reference<V>) UnsafeAccess.UNSAFE.getObject(this, VALUE_OFFSET)).get();
    }

    public final void setValue(V value, ReferenceQueue<V> referenceQueue) {
      UnsafeAccess.UNSAFE.putOrderedObject(this, VALUE_OFFSET, new WeakValueReference<V>(key, value, referenceQueue));
    }

    public final boolean containsValue(Object value) {
      return getValue() == value;
    }

    public final boolean isAlive() {
      Object key = getKeyReference();
      return (key != RETIRED_WEAK_KEY) && (key != DEAD_WEAK_KEY);
    }

    public final boolean isRetired() {
      return (getKeyReference() == RETIRED_WEAK_KEY);
    }

    public final void retire() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, RETIRED_WEAK_KEY);
    }

    public final boolean isDead() {
      return (getKeyReference() == DEAD_WEAK_KEY);
    }

    public final void die() {
      UnsafeAccess.UNSAFE.putOrderedObject(this, KEY_OFFSET, DEAD_WEAK_KEY);
    }

    public final String toString() {
      return String.format("%s=[key=%s, value=%s, weight=%d, accessTimeNS=%,d, writeTimeNS=%,d, "
          + "prevInAccess=%s, nextInAccess=%s, prevInWrite=%s, nextInWrite=%s]",
          getClass().getSimpleName(), getKey(), getValue(), getWeight(), getAccessTime(),
          getWriteTime(), getPreviousInAccessOrder() != null, getNextInAccessOrder() != null,
          getPreviousInWriteOrder() != null, getNextInWriteOrder() != null);
    }
  }

  static class WWA<K, V> extends WW<K, V> {
    protected static final long ACCESS_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WWA.class, "accessTime");

    protected volatile long accessTime;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWA(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    WWA(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, now);
    }

    public final long getAccessTime() {
      return UnsafeAccess.UNSAFE.getLong(this, ACCESS_TIME_OFFSET);
    }

    public final void setAccessTime(long accessTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, ACCESS_TIME_OFFSET, accessTime);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WWAMS<K, V> extends WWA<K, V> {
    WWAMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWAMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WWAMW<K, V> extends WWA<K, V> {
    protected int weight;

    WWAMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWAMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WWAR<K, V> extends WWA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WWAR.class, "writeTime");

    protected volatile long writeTime;

    WWAR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WWAR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WWARMS<K, V> extends WWAR<K, V> {
    WWARMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWARMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WWARMW<K, V> extends WWAR<K, V> {
    protected int weight;

    WWARMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWARMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WWAW<K, V> extends WWA<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WWAW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WWAW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WWAW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WWAWMS<K, V> extends WWAW<K, V> {
    WWAWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWAWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WWAWMW<K, V> extends WWAW<K, V> {
    protected int weight;

    WWAWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWAWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static class WWAWR<K, V> extends WWAW<K, V> {
    WWAWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWAWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WWAWRMS<K, V> extends WWAWR<K, V> {
    WWAWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWAWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }
  }

  static final class WWAWRMW<K, V> extends WWAWR<K, V> {
    protected int weight;

    WWAWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWAWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }
  }

  static final class WWMS<K, V> extends WW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WWMW<K, V> extends WW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WWR<K, V> extends WW<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WWR.class, "writeTime");

    protected volatile long writeTime;

    WWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WWRMS<K, V> extends WWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WWRMW<K, V> extends WWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WWW<K, V> extends WW<K, V> {
    protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(WWW.class, "writeTime");

    protected volatile long writeTime;

    protected Node<K, V> previousInWriteOrder;

    protected Node<K, V> nextInWriteOrder;

    WWW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    WWW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, now);
    }

    public final long getWriteTime() {
      return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
    }

    public final void setWriteTime(long writeTime) {
      UnsafeAccess.UNSAFE.putOrderedLong(this, WRITE_TIME_OFFSET, writeTime);
    }

    public final Node<K, V> getPreviousInWriteOrder() {
      return previousInWriteOrder;
    }

    public final void setPreviousInWriteOrder(Node<K, V> previousInWriteOrder) {
      this.previousInWriteOrder = previousInWriteOrder;
    }

    public final Node<K, V> getNextInWriteOrder() {
      return nextInWriteOrder;
    }

    public final void setNextInWriteOrder(Node<K, V> nextInWriteOrder) {
      this.nextInWriteOrder = nextInWriteOrder;
    }
  }

  static final class WWWMS<K, V> extends WWW<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWWMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWWMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WWWMW<K, V> extends WWW<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWWMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWWMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static class WWWR<K, V> extends WWW<K, V> {
    WWWR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWWR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final boolean casWriteTime(long expect, long update) {
      return UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
    }
  }

  static final class WWWRMS<K, V> extends WWWR<K, V> {
    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWWRMS(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    }

    WWWRMS(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }

  static final class WWWRMW<K, V> extends WWWR<K, V> {
    protected int weight;

    protected Node<K, V> previousInAccessOrder;

    protected Node<K, V> nextInAccessOrder;

    WWWRMW(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    WWWRMW(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
      super(keyReference, value, valueReferenceQueue, weight, now);
      this.weight = weight;
    }

    public final int getWeight() {
      return weight;
    }

    public final void setWeight(int weight) {
      this.weight = weight;
    }

    public final Node<K, V> getPreviousInAccessOrder() {
      return previousInAccessOrder;
    }

    public final void setPreviousInAccessOrder(Node<K, V> previousInAccessOrder) {
      this.previousInAccessOrder = previousInAccessOrder;
    }

    public final Node<K, V> getNextInAccessOrder() {
      return nextInAccessOrder;
    }

    public final void setNextInAccessOrder(Node<K, V> nextInAccessOrder) {
      this.nextInAccessOrder = nextInAccessOrder;
    }
  }
}
