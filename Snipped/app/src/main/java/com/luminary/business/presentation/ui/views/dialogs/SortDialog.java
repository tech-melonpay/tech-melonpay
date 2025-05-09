package com.luminary.business.presentation.ui.views.dialogs;

import F0.d;
import F0.f;
import F8.o;
import O9.p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import ca.InterfaceC0650p;
import com.google.android.material.tabs.TabLayout;
import com.luminary.mobile.R;
import t6.AbstractC1379l2;
import v8.DialogC1549a;
import y8.C1625f;

/* compiled from: SortDialog.kt */
/* loaded from: classes2.dex */
public final class SortDialog extends DialogC1549a {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0650p<? super Status, ? super Direction, p> f13210q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1379l2 f13211r;

    /* renamed from: s, reason: collision with root package name */
    public Direction f13212s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortDialog.kt */
    public static final class Direction {

        /* renamed from: a, reason: collision with root package name */
        public static final Direction f13213a;

        /* renamed from: b, reason: collision with root package name */
        public static final Direction f13214b;

        /* renamed from: c, reason: collision with root package name */
        public static final Direction f13215c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Direction[] f13216d;

        static {
            Direction direction = new Direction("All", 0);
            f13213a = direction;
            Direction direction2 = new Direction("Incoming", 1);
            f13214b = direction2;
            Direction direction3 = new Direction("Outgoing", 2);
            f13215c = direction3;
            f13216d = new Direction[]{direction, direction2, direction3};
        }

        public Direction() {
            throw null;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) f13216d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortDialog.kt */
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f13217a;

        /* renamed from: b, reason: collision with root package name */
        public static final Status f13218b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f13219c;

        /* renamed from: d, reason: collision with root package name */
        public static final Status f13220d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ Status[] f13221e;

        static {
            Status status = new Status("NewToOld", 0);
            f13217a = status;
            Status status2 = new Status("OldToNew", 1);
            f13218b = status2;
            Status status3 = new Status("HighToLow", 2);
            f13219c = status3;
            Status status4 = new Status("LowToHigh", 3);
            f13220d = status4;
            f13221e = new Status[]{status, status2, status3, status4};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f13221e.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SortDialog.kt */
    public static final class Type {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Type[] f13222a = {new Type("Transactions", 0), new Type("Invoices", 1)};

        /* JADX INFO: Fake field, exist only in values array */
        Type EF5;

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f13222a.clone();
        }
    }

    /* compiled from: SortDialog.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13223a;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Type[] typeArr = Type.f13222a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                Status status = Status.f13217a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Status status2 = Status.f13217a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Status status3 = Status.f13217a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f13223a = iArr2;
            int[] iArr3 = new int[Direction.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Direction direction = Direction.f13213a;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Direction direction2 = Direction.f13213a;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: SortDialog.kt */
    public static final class b implements TabLayout.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC1379l2 f13224a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SortDialog f13225b;

        public b(AbstractC1379l2 abstractC1379l2, SortDialog sortDialog) {
            this.f13224a = abstractC1379l2;
            this.f13225b = sortDialog;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void a(TabLayout.g gVar) {
            int selectedTabPosition = this.f13224a.f29227A.getSelectedTabPosition();
            SortDialog sortDialog = this.f13225b;
            if (selectedTabPosition == 0) {
                sortDialog.f13212s = Direction.f13213a;
            } else if (selectedTabPosition == 1) {
                sortDialog.f13212s = Direction.f13215c;
            } else {
                if (selectedTabPosition != 2) {
                    return;
                }
                sortDialog.f13212s = Direction.f13214b;
            }
        }
    }

    public SortDialog(Context context) {
        super(context);
        LayoutInflater from = LayoutInflater.from(context);
        int i = AbstractC1379l2.f29226C;
        DataBinderMapperImpl dataBinderMapperImpl = d.f1140a;
        AbstractC1379l2 abstractC1379l2 = (AbstractC1379l2) f.f(from, R.layout.dialog_sort, null, false, null);
        this.f13211r = abstractC1379l2;
        Type[] typeArr = Type.f13222a;
        this.f13212s = Direction.f13213a;
        setCancelable(false);
        setContentView(abstractC1379l2.f1148d);
        setCanceledOnTouchOutside(false);
        j().setHideable(true);
        o.c(abstractC1379l2.f29229n, 500L, new C1625f(this, 0));
    }

    @Override // com.google.android.material.bottomsheet.e, h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        j().setState(3);
        super.onCreate(bundle);
        AbstractC1379l2 abstractC1379l2 = this.f13211r;
        abstractC1379l2.f29227A.a(new b(abstractC1379l2, this));
        o.c(abstractC1379l2.f29236u, 500L, new C1625f(this, 1));
        o.c(abstractC1379l2.f29239x, 500L, new C1625f(this, 2));
        o.c(abstractC1379l2.f29230o, 500L, new C1625f(this, 3));
        o.c(abstractC1379l2.f29233r, 500L, new C1625f(this, 4));
    }
}
