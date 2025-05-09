package org.jmrtd.cbeff;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import net.sf.scuba.util.Hex;

/* loaded from: classes3.dex */
public class StandardBiometricHeader implements Serializable {
    private static final long serialVersionUID = 4113147521594478513L;
    private SortedMap<Integer, byte[]> elements;

    public StandardBiometricHeader(Map<Integer, byte[]> map) {
        this.elements = new TreeMap(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return equals(this.elements, ((StandardBiometricHeader) obj).elements);
        }
        return false;
    }

    public SortedMap<Integer, byte[]> getElements() {
        return new TreeMap((SortedMap) this.elements);
    }

    public int hashCode() {
        SortedMap<Integer, byte[]> sortedMap = this.elements;
        return 31 + (sortedMap == null ? 0 : sortedMap.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StandardBiometricHeader [");
        boolean z10 = true;
        for (Map.Entry<Integer, byte[]> entry : this.elements.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(Integer.toHexString(entry.getKey().intValue()));
            sb2.append(" -> ");
            sb2.append(Hex.bytesToHexString(entry.getValue()));
        }
        sb2.append("]");
        return sb2.toString();
    }

    private static boolean equals(Map<Integer, byte[]> map, Map<Integer, byte[]> map2) {
        if (map == null && map2 != null) {
            return false;
        }
        if (map != null && map2 == null) {
            return false;
        }
        if (map == map2) {
            return true;
        }
        if (!map.keySet().equals(map2.keySet())) {
            return false;
        }
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            Integer key = entry.getKey();
            key.intValue();
            if (!Arrays.equals(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}
