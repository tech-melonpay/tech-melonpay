package androidx.work.impl;

import B1.d;
import B1.f;
import B1.g;
import B1.h;
import B1.j;
import B1.k;
import B1.m;
import B1.n;
import B1.p;
import B1.q;
import B1.s;
import B1.t;
import B1.v;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.b;
import java.util.concurrent.TimeUnit;

@TypeConverters({b.class, v.class})
@Database(entities = {B1.a.class, p.class, s.class, g.class, j.class, m.class, d.class}, version = 12)
/* loaded from: classes.dex */
public abstract class WorkDatabase extends RoomDatabase {

    /* renamed from: a, reason: collision with root package name */
    public static final long f8133a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8134b = 0;

    public abstract B1.b a();

    public abstract f b();

    public abstract h c();

    public abstract k d();

    public abstract n e();

    public abstract q f();

    public abstract t g();
}
