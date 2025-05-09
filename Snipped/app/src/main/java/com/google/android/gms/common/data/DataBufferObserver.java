package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
/* loaded from: classes.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface Observable {
        void addObserver(DataBufferObserver dataBufferObserver);

        void removeObserver(DataBufferObserver dataBufferObserver);
    }

    void onDataChanged();

    void onDataRangeChanged(int i, int i9);

    void onDataRangeInserted(int i, int i9);

    void onDataRangeMoved(int i, int i9, int i10);

    void onDataRangeRemoved(int i, int i9);
}
