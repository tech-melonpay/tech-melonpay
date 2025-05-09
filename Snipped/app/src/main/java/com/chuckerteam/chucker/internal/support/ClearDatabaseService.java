package com.chuckerteam.chucker.internal.support;

import C.N;
import android.content.Context;
import androidx.room.Room;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import j0.i;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: ClearDatabaseService.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/support/ClearDatabaseService;", "Lj0/i;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ClearDatabaseService extends i {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f8627f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f8628e = CoroutineScopeKt.MainScope();

    @Override // j0.i
    public final void a() {
        Context applicationContext = getApplicationContext();
        if (Ja.a.f2210a == null) {
            int i = ChuckerDatabase.f8621a;
            Ja.a.f2210a = new N((ChuckerDatabase) Room.databaseBuilder(applicationContext, ChuckerDatabase.class, "chucker.db").fallbackToDestructiveMigration().build(), 3);
        }
        BuildersKt__Builders_commonKt.launch$default(this.f8628e, null, null, new ClearDatabaseService$onHandleWork$1(this, null), 3, null);
    }
}
