package p2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import j2.AbstractC0892k;
import p2.j;
import s2.C1203a;
import t.C1257i;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements j.a, CallbackToFutureAdapter.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f25599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25600b;

    public /* synthetic */ i(long j10, AbstractC0892k abstractC0892k) {
        this.f25599a = j10;
        this.f25600b = abstractC0892k;
    }

    @Override // p2.j.a, androidx.camera.core.impl.utils.futures.AsyncFunction
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f25599a));
        AbstractC0892k abstractC0892k = (AbstractC0892k) this.f25600b;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC0892k.b(), String.valueOf(C1203a.a(abstractC0892k.d()))}) < 1) {
            contentValues.put("backend_name", abstractC0892k.b());
            contentValues.put("priority", Integer.valueOf(C1203a.a(abstractC0892k.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.b
    public Object attachCompleter(final CallbackToFutureAdapter.a aVar) {
        C1257i c1257i = (C1257i) this.f25600b;
        c1257i.getClass();
        final long j10 = this.f25599a;
        c1257i.a(new C1257i.c() { // from class: t.h
            @Override // t.C1257i.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                if (!C1257i.h(totalCaptureResult, j10)) {
                    return false;
                }
                aVar.b(null);
                return true;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public /* synthetic */ i(C1257i c1257i, long j10) {
        this.f25600b = c1257i;
        this.f25599a = j10;
    }
}
