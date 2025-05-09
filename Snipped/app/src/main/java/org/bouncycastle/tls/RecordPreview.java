package org.bouncycastle.tls;

/* loaded from: classes3.dex */
public final class RecordPreview {
    private final int applicationDataLimit;
    private final int recordSize;

    public RecordPreview(int i, int i9) {
        this.recordSize = i;
        this.applicationDataLimit = i9;
    }

    public static RecordPreview combine(RecordPreview recordPreview, RecordPreview recordPreview2) {
        return new RecordPreview(recordPreview2.getRecordSize() + recordPreview.getRecordSize(), recordPreview2.getApplicationDataLimit() + recordPreview.getApplicationDataLimit());
    }

    public int getApplicationDataLimit() {
        return this.applicationDataLimit;
    }

    public int getRecordSize() {
        return this.recordSize;
    }
}
