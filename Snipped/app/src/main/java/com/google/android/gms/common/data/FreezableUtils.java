package com.google.android.gms.common.data;

import com.airbnb.epoxy.ControllerModelList;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
/* loaded from: classes.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        ControllerModelList controllerModelList = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            controllerModelList.add((ControllerModelList) arrayList.get(i).freeze());
        }
        return controllerModelList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        ControllerModelList controllerModelList = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            controllerModelList.add((ControllerModelList) it.next().freeze());
        }
        return controllerModelList;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        ControllerModelList controllerModelList = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e10 : eArr) {
            controllerModelList.add((ControllerModelList) e10.freeze());
        }
        return controllerModelList;
    }
}
