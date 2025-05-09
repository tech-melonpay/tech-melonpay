package com.luminary.business.presentation.ui.views.dialogs;

import F0.d;
import F0.f;
import F8.o;
import O9.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0635a;
import ca.InterfaceC0651q;
import com.luminary.mobile.R;
import t6.AbstractC1403o2;
import v8.DialogC1549a;
import y8.C1626g;

/* compiled from: SortStatisticsDialog.kt */
/* loaded from: classes2.dex */
public final class SortStatisticsDialog extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public final Context f13228q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0651q<? super StatisticType, ? super Long, ? super Long, p> f13229r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1403o2 f13230s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortStatisticsDialog.kt */
    public static final class StatisticType {

        /* renamed from: a, reason: collision with root package name */
        public static final StatisticType f13231a;

        /* renamed from: b, reason: collision with root package name */
        public static final StatisticType f13232b;

        /* renamed from: c, reason: collision with root package name */
        public static final StatisticType f13233c;

        /* renamed from: d, reason: collision with root package name */
        public static final StatisticType f13234d;

        /* renamed from: e, reason: collision with root package name */
        public static final StatisticType f13235e;

        /* renamed from: f, reason: collision with root package name */
        public static final StatisticType f13236f;

        /* renamed from: g, reason: collision with root package name */
        public static final StatisticType f13237g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ StatisticType[] f13238h;

        static {
            StatisticType statisticType = new StatisticType("DATE_RANGE", 0);
            f13231a = statisticType;
            StatisticType statisticType2 = new StatisticType("LAST_7_DAYS", 1);
            f13232b = statisticType2;
            StatisticType statisticType3 = new StatisticType("LAST_30_DAYS", 2);
            f13233c = statisticType3;
            StatisticType statisticType4 = new StatisticType("LAST_12_MONTHS", 3);
            f13234d = statisticType4;
            StatisticType statisticType5 = new StatisticType("CURRENT_WEEK", 4);
            f13235e = statisticType5;
            StatisticType statisticType6 = new StatisticType("CURRENT_MONTH", 5);
            f13236f = statisticType6;
            StatisticType statisticType7 = new StatisticType("CURRENT_YEAR", 6);
            f13237g = statisticType7;
            f13238h = new StatisticType[]{statisticType, statisticType2, statisticType3, statisticType4, statisticType5, statisticType6, statisticType7};
        }

        public StatisticType() {
            throw null;
        }

        public static StatisticType valueOf(String str) {
            return (StatisticType) Enum.valueOf(StatisticType.class, str);
        }

        public static StatisticType[] values() {
            return (StatisticType[]) f13238h.clone();
        }
    }

    public SortStatisticsDialog(Context context) {
        super(context);
        this.f13228q = context;
        LayoutInflater from = LayoutInflater.from(getContext());
        int i = AbstractC1403o2.f29410C;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1403o2 abstractC1403o2 = (AbstractC1403o2) f.f(from, R.layout.dialog_sort_statistics, null, false, null);
        this.f13230s = abstractC1403o2;
        StatisticType statisticType = StatisticType.f13231a;
        setCancelable(false);
        setContentView(abstractC1403o2.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1403o2.f29414o, 500L, new C1626g(this, 0));
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        j().setState(3);
        super.onCreate(bundle);
        final AbstractC1403o2 abstractC1403o2 = this.f13230s;
        o.c(abstractC1403o2.f29420u, 500L, new C1626g(this, 3));
        final int i = 3;
        o.c(abstractC1403o2.f29421v, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29418s, 500L, new C1626g(this, 6));
        final int i9 = 4;
        o.c(abstractC1403o2.f29419t, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29416q, 500L, new C1626g(this, 7));
        final int i10 = 5;
        o.c(abstractC1403o2.f29417r, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29424y, 500L, new C1626g(this, 1));
        final int i11 = 0;
        o.c(abstractC1403o2.f29425z, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29422w, 500L, new C1626g(this, 2));
        final int i12 = 1;
        o.c(abstractC1403o2.f29423x, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29411A, 500L, new C1626g(this, 4));
        final int i13 = 2;
        o.c(abstractC1403o2.f29412B, 500L, new InterfaceC0635a() { // from class: y8.h
            @Override // ca.InterfaceC0635a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        abstractC1403o2.f29424y.performClick();
                        break;
                    case 1:
                        abstractC1403o2.f29422w.performClick();
                        break;
                    case 2:
                        abstractC1403o2.f29411A.performClick();
                        break;
                    case 3:
                        abstractC1403o2.f29420u.performClick();
                        break;
                    case 4:
                        abstractC1403o2.f29418s.performClick();
                        break;
                    default:
                        abstractC1403o2.f29416q.performClick();
                        break;
                }
                return p.f3034a;
            }
        });
        o.c(abstractC1403o2.f29415p, 500L, new C1626g(this, 5));
    }
}
