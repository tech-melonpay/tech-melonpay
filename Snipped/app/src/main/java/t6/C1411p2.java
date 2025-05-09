package t6;

import android.util.SparseIntArray;
import com.luminary.mobile.R;

/* compiled from: DialogSortStatisticsBindingImpl.java */
/* renamed from: t6.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1411p2 extends AbstractC1403o2 {

    /* renamed from: E, reason: collision with root package name */
    public static final SparseIntArray f29451E;

    /* renamed from: D, reason: collision with root package name */
    public long f29452D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29451E = sparseIntArray;
        sparseIntArray.put(R.id.title_text, 1);
        sparseIntArray.put(R.id.close, 2);
        sparseIntArray.put(R.id.customDate, 3);
        sparseIntArray.put(R.id.calendar, 4);
        sparseIntArray.put(R.id.customDateTitle, 5);
        sparseIntArray.put(R.id.customDateDescription, 6);
        sparseIntArray.put(R.id.last7Days, 7);
        sparseIntArray.put(R.id.last7DaysCheckBox, 8);
        sparseIntArray.put(R.id.last7DaysTitle, 9);
        sparseIntArray.put(R.id.last7DaysDescription, 10);
        sparseIntArray.put(R.id.last30Days, 11);
        sparseIntArray.put(R.id.last30DaysCheckBox, 12);
        sparseIntArray.put(R.id.last30DaysTitle, 13);
        sparseIntArray.put(R.id.last30DaysDescription, 14);
        sparseIntArray.put(R.id.last12Months, 15);
        sparseIntArray.put(R.id.last12MonthsCheckBox, 16);
        sparseIntArray.put(R.id.last12MonthsTitle, 17);
        sparseIntArray.put(R.id.last12MonthsDescription, 18);
        sparseIntArray.put(R.id.thisWeek, 19);
        sparseIntArray.put(R.id.thisWeekCheckBox, 20);
        sparseIntArray.put(R.id.thisWeekTitle, 21);
        sparseIntArray.put(R.id.thisWeekDescription, 22);
        sparseIntArray.put(R.id.thisMonth, 23);
        sparseIntArray.put(R.id.thisMonthCheckBox, 24);
        sparseIntArray.put(R.id.thisMonthTitle, 25);
        sparseIntArray.put(R.id.thisMonthDescription, 26);
        sparseIntArray.put(R.id.thisYear, 27);
        sparseIntArray.put(R.id.thisYearCheckBox, 28);
        sparseIntArray.put(R.id.thisYearTitle, 29);
        sparseIntArray.put(R.id.thisYearDescription, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1411p2(F0.c r21, android.view.View r22) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.C1411p2.<init>(F0.c, android.view.View):void");
    }

    @Override // F0.f
    public final void b() {
        synchronized (this) {
            this.f29452D = 0L;
        }
    }

    @Override // F0.f
    public final boolean e() {
        synchronized (this) {
            try {
                return this.f29452D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // F0.f
    public final boolean m(int i, Object obj) {
        return true;
    }
}
