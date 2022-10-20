package ru.vsu.cs.sviridov_d_v.util.dummy;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;

public interface DefaultNotSupportedSortedMap<K, V> extends DefaultNotSupportedMap<K, V>, SortedMap<K, V> {

    @Override
    default Comparator<? super K> comparator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default SortedMap<K, V> subMap(K fromKey, K toKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default SortedMap<K, V> headMap(K toKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default SortedMap<K, V> tailMap(K fromKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default K firstKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default K lastKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default Collection<V> values() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    default Set<Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
