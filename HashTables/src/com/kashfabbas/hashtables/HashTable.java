package com.kashfabbas.hashtables;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable {
  private class Entry {
    private int key;
    private String value;

    public Entry(int key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  private LinkedList<Entry>[] entries = new LinkedList[5];

  public void put(int key, String value) {

    var entry = getEntry(key);
    if (entry != null) {
      entry.value = value;
        return;
    }

    getOrCreateBucket(key).add(new Entry(key, value));
//    var bucket = getOrCreateBucket(key);  // 2 in 1
//    bucket.add(new Entry(key, value));

//    var index = hash(key);
//    if (entries[index] == null)
//      entries[index] = new LinkedList<>();

//    var bucket = entries[index];
//    for (var entry : bucket) {
//      if (entry.key == key) {
//        entry.value = value;
//        return;
//      }
//    }
  }

  public String get(int key) {
    var entry = getEntry(key);

    return entry == null ? null : entry.value;

//    if (entry == null)  // 2 in 1
//      return null;
//    return entry.value;

//    var index = hash(key);
//    var bucket = entries[index];
//
//    if (bucket != null) {
//      for (var entry : bucket)
//        if (entry.key == key)
//          return entry.value;
//    }
//    return null;
  }

  public void remove(int key) {
    var entry = getEntry(key);
    if (entry == null)
      throw new IllegalStateException();
    getBucket(key).remove(entry);

//    var index = hash(key);    // 2 in 1
//    var bucket = entries[index];
//    if (bucket == null)
//      throw new IllegalStateException();
//    for (var entry : bucket) {
//      if (entry.key == key) {
//        bucket.remove(entry);
//        return;
//      }
//    }
//    throw new IllegalStateException();
  }

  private LinkedList<Entry> getBucket(int key) {
    return entries[hash(key)];

//    var index = hash(key);  // 2 in 1
//    var bucket = entries[index];
//    return bucket;
  }

  private LinkedList<Entry> getOrCreateBucket(int key) {
    var index = hash(key);
    var bucket = entries[index];
    if (bucket == null)
      entries[index] = new LinkedList<>();

    return bucket;
  }

  private Entry getEntry(int key) {
    var bucket = getBucket(key);
    if (bucket != null) {
      for (var entry : bucket) {
          if (entry.key == key)
            return entry;
      }
    }
    return null;
  }

  private int hash(int key) {
    return key % entries.length;
  }
}
