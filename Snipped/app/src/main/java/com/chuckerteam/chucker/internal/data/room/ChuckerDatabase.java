package com.chuckerteam.chucker.internal.data.room;

import R1.a;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Metadata;

/* compiled from: ChuckerDatabase.kt */
@Database(entities = {HttpTransaction.class}, exportSchema = false, version = 9)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/data/room/ChuckerDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public abstract class ChuckerDatabase extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8621a = 0;

    public abstract a a();
}
