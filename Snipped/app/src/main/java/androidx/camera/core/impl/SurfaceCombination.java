package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class SurfaceCombination {
    private final List<SurfaceConfig> mSurfaceConfigList = new ArrayList();

    private static void generateArrangements(List<int[]> list, int i, int[] iArr, int i9) {
        if (i9 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i10 = 0; i10 < i; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= i9) {
                    iArr[i9] = i10;
                    generateArrangements(list, i, iArr, i9 + 1);
                    break;
                } else if (i10 == iArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
    }

    private List<int[]> getElementsArrangements(int i) {
        ArrayList arrayList = new ArrayList();
        generateArrangements(arrayList, i, new int[i], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.add(surfaceConfig);
    }

    public List<SurfaceConfig> getOrderedSupportedSurfaceConfigList(List<SurfaceConfig> list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.mSurfaceConfigList.size()) {
            return null;
        }
        List<int[]> elementsArrangements = getElementsArrangements(this.mSurfaceConfigList.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        for (int[] iArr : elementsArrangements) {
            boolean z10 = true;
            for (int i = 0; i < this.mSurfaceConfigList.size(); i++) {
                if (iArr[i] < list.size()) {
                    z10 &= this.mSurfaceConfigList.get(i).isSupported(list.get(iArr[i]));
                    if (!z10) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = this.mSurfaceConfigList.get(i);
                }
            }
            if (z10) {
                return Arrays.asList(surfaceConfigArr);
            }
        }
        return null;
    }

    public List<SurfaceConfig> getSurfaceConfigList() {
        return this.mSurfaceConfigList;
    }

    public boolean removeSurfaceConfig(SurfaceConfig surfaceConfig) {
        return this.mSurfaceConfigList.remove(surfaceConfig);
    }
}
