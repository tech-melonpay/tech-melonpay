package com.luminary.business.presentation.ui.base;

import B6.i;
import F0.f;
import J5.b;
import K8.a;
import O9.p;
import U4.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.A;
import androidx.lifecycle.C0559z;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.base.BaseActivity;
import com.luminary.business.presentation.ui.base.BaseFragment;
import com.luminary.business.presentation.ui.fragments.cards.CardsFragment;
import com.luminary.business.presentation.ui.fragments.invoices.InvoicesDateFragment;
import com.luminary.business.presentation.ui.fragments.statistics.StatisticsFragment;
import com.luminary.business.presentation.ui.fragments.tfa.TfaFragment;
import com.luminary.business.presentation.ui.views.dialogs.SortDialog;
import com.luminary.business.presentation.ui.views.dialogs.SortStatisticsDialog;
import com.luminary.business.presentation.ui.views.toolbar.CustomToolbarView;
import com.luminary.business.presentation.ui.views.toolbar.ToolbarStatus;
import com.luminary.business.presentation.utils.lifecycle.KeyboardTriggerBehavior;
import com.luminary.mobile.R;
import java.io.File;
import java.util.Date;
import java.util.List;
import k0.C0913a;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h;
import t6.AbstractC1291a2;
import t6.AbstractC1296b;
import t6.AbstractC1379l2;
import t6.AbstractC1403o2;
import y8.DialogC1622c;

/* compiled from: BaseFragment.kt */
/* loaded from: classes2.dex */
public abstract class BaseFragment<T extends f> extends Fragment implements B6.a {

    /* renamed from: f0, reason: collision with root package name */
    public CustomToolbarView.State f11464f0 = CustomToolbarView.State.f13256a;

    /* renamed from: g0, reason: collision with root package name */
    public final O9.f f11465g0 = org.koin.java.a.a(D8.a.class);

    /* renamed from: h0, reason: collision with root package name */
    public boolean f11466h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f11467i0;

    /* renamed from: j0, reason: collision with root package name */
    public ToolbarStatus f11468j0;

    /* renamed from: k0, reason: collision with root package name */
    public T f11469k0;

    /* renamed from: l0, reason: collision with root package name */
    public final O9.f f11470l0;

    /* renamed from: m0, reason: collision with root package name */
    public i f11471m0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BaseFragment.kt */
    public static final class VibrateType {

        /* renamed from: a, reason: collision with root package name */
        public static final VibrateType f11475a;

        /* renamed from: b, reason: collision with root package name */
        public static final VibrateType f11476b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ VibrateType[] f11477c;

        /* JADX INFO: Fake field, exist only in values array */
        VibrateType EF0;

        static {
            VibrateType vibrateType = new VibrateType("DEFAULT_AMPLITUDE", 0);
            VibrateType vibrateType2 = new VibrateType("EFFECT_CLICK", 1);
            VibrateType vibrateType3 = new VibrateType("EFFECT_DOUBLE_CLICK", 2);
            VibrateType vibrateType4 = new VibrateType("EFFECT_HEAVY_CLICK", 3);
            f11475a = vibrateType4;
            VibrateType vibrateType5 = new VibrateType("EFFECT_TICK", 4);
            f11476b = vibrateType5;
            f11477c = new VibrateType[]{vibrateType, vibrateType2, vibrateType3, vibrateType4, vibrateType5};
        }

        public VibrateType() {
            throw null;
        }

        public static VibrateType valueOf(String str) {
            return (VibrateType) Enum.valueOf(VibrateType.class, str);
        }

        public static VibrateType[] values() {
            return (VibrateType[]) f11477c.clone();
        }
    }

    /* compiled from: BaseFragment.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11478a;

        static {
            int[] iArr = new int[KeyboardTriggerBehavior.Status.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KeyboardTriggerBehavior.Status status = KeyboardTriggerBehavior.Status.f13334a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[CustomToolbarView.State.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CustomToolbarView.State state = CustomToolbarView.State.f13256a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f11478a = iArr2;
            int[] iArr3 = new int[VibrateType.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                VibrateType vibrateType = VibrateType.f11475a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                VibrateType vibrateType2 = VibrateType.f11475a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                VibrateType vibrateType3 = VibrateType.f11475a;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                VibrateType vibrateType4 = VibrateType.f11475a;
                iArr3[4] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: BaseFragment.kt */
    public static final class b implements A, d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f11479a;

        public b(InterfaceC0646l interfaceC0646l) {
            this.f11479a = interfaceC0646l;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f11479a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f11479a.invoke(obj);
        }
    }

    public BaseFragment() {
        final B6.f fVar = new B6.f(this, 0);
        this.f11470l0 = kotlin.a.b(LazyThreadSafetyMode.f23085a, new InterfaceC0635a<K8.a>() { // from class: com.luminary.business.presentation.ui.base.BaseFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [K8.a, java.lang.Object] */
            @Override // ca.InterfaceC0635a
            public final a invoke() {
                return b.l(this).a(fVar, null, h.a(a.class));
            }
        });
    }

    public static void P0(BaseFragment baseFragment, String str) {
        Toast.makeText(baseFragment.requireContext(), str, 0).show();
    }

    public static void q0(BaseFragment baseFragment, List list) {
        baseFragment.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", list != null ? (String[]) list.toArray(new String[0]) : null);
            baseFragment.startActivity(intent);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "";
            }
            P0(baseFragment, message);
        }
    }

    public final void A0(String str) {
        if (str != null) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            startActivity(intent);
        }
    }

    public final void B0() {
        AppBarLayout appBarLayout;
        ViewGroup.LayoutParams layoutParams;
        ActivityC0533g requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            Object obj = mainActivity.f11453m;
            if (obj == null) {
                obj = null;
            }
            appBarLayout = ((AbstractC1296b) obj).f28799n;
        } else {
            appBarLayout = null;
        }
        if (appBarLayout != null) {
            appBarLayout.setActivated(false);
        }
        if (appBarLayout != null && (layoutParams = appBarLayout.getLayoutParams()) != null) {
            layoutParams.height = (int) D9.b.T(63);
        }
        ActivityC0533g requireActivity2 = requireActivity();
        MainActivity mainActivity2 = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
        if (mainActivity2 != null) {
            mainActivity2.f11417y = true;
        }
    }

    public boolean C0() {
        return !(this instanceof CardsFragment);
    }

    public final void G0(Date date, Date date2) {
        DialogC1622c dialogC1622c = new DialogC1622c(requireContext());
        dialogC1622c.f31130s = new BaseFragment$openFilterDialog$1(2, (InvoicesDateFragment) this, BaseFragment.class, "onFilter", "onFilter(Ljava/util/Date;Ljava/util/Date;)V", 0);
        dialogC1622c.show();
        dialogC1622c.f31131t = date;
        dialogC1622c.f31132u = date2;
        AbstractC1291a2 abstractC1291a2 = dialogC1622c.f31129r;
        if (date != null) {
            CharSequence format = DateFormat.format("dd", date);
            CharSequence format2 = DateFormat.format("MM", date);
            CharSequence format3 = DateFormat.format("yyyy", date);
            abstractC1291a2.f28788q.setText(((Object) format) + "/" + ((Object) format2) + "/" + ((Object) format3));
        }
        if (date2 != null) {
            CharSequence format4 = DateFormat.format("dd", date2);
            CharSequence format5 = DateFormat.format("MM", date2);
            CharSequence format6 = DateFormat.format("yyyy", date2);
            abstractC1291a2.f28789r.setText(((Object) format4) + "/" + ((Object) format5) + "/" + ((Object) format6));
        }
    }

    public final void H0(SortStatisticsDialog.StatisticType statisticType) {
        SortStatisticsDialog sortStatisticsDialog = new SortStatisticsDialog(requireContext());
        sortStatisticsDialog.f13229r = new BaseFragment$openFilterStatisticsDialog$1(3, (StatisticsFragment) this, BaseFragment.class, "onSortStatistic", "onSortStatistic(Lcom/luminary/business/presentation/ui/views/dialogs/SortStatisticsDialog$StatisticType;Ljava/lang/Long;Ljava/lang/Long;)V", 0);
        sortStatisticsDialog.show();
        int ordinal = statisticType.ordinal();
        AbstractC1403o2 abstractC1403o2 = sortStatisticsDialog.f13230s;
        switch (ordinal) {
            case 0:
                abstractC1403o2.f29413n.setBackgroundResource(R.drawable.circle_main_color);
                abstractC1403o2.f29413n.setColorFilter(C0913a.getColor(sortStatisticsDialog.getContext(), R.color.small_element_color), PorterDuff.Mode.SRC_IN);
                return;
            case 1:
                abstractC1403o2.f29421v.setChecked(true);
                return;
            case 2:
                abstractC1403o2.f29419t.setChecked(true);
                return;
            case 3:
                abstractC1403o2.f29417r.setChecked(true);
                return;
            case 4:
                abstractC1403o2.f29425z.setChecked(true);
                return;
            case 5:
                abstractC1403o2.f29423x.setChecked(true);
                return;
            case 6:
                abstractC1403o2.f29412B.setChecked(true);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void I0(String str) {
        this.f11467i0 = true;
        this.f11464f0 = CustomToolbarView.State.f13257b;
        ((BaseActivity) requireActivity()).u(str);
        p0(true);
        L0();
    }

    public final void J0() {
        MainActivity.Navigation[] navigationArr = MainActivity.Navigation.f11421a;
        ((BaseActivity) requireActivity()).w();
        Bundle bundle = new Bundle();
        bundle.putBoolean("isSend", true);
        bundle.putBoolean("isAll", false);
        U4.b.g(this).i(R.id.action_global_paymentsFragment, bundle);
    }

    public final void K0(SortDialog.Status status, SortDialog.Direction direction) {
        SortDialog.Type[] typeArr = SortDialog.Type.f13222a;
        SortDialog sortDialog = new SortDialog(requireContext());
        sortDialog.f13210q = new BaseFragment$openSortDialog$1(2, (InvoicesDateFragment) this, BaseFragment.class, "onSort", "onSort(Lcom/luminary/business/presentation/ui/views/dialogs/SortDialog$Status;Lcom/luminary/business/presentation/ui/views/dialogs/SortDialog$Direction;)V", 0);
        sortDialog.show();
        AbstractC1379l2 abstractC1379l2 = sortDialog.f13211r;
        abstractC1379l2.f29228B.setText(D9.b.l(sortDialog.getContext().getString(R.string.sort_key, sortDialog.getContext().getString(R.string.invoices))));
        abstractC1379l2.f29237v.setText(D9.b.l(sortDialog.getContext().getString(R.string.newest_first, sortDialog.getContext().getString(R.string.invoices))));
        abstractC1379l2.f29240y.setText(D9.b.l(sortDialog.getContext().getString(R.string.oldest_first, sortDialog.getContext().getString(R.string.invoices))));
        abstractC1379l2.f29231p.setText(D9.b.l(sortDialog.getContext().getString(R.string.highest_value_first, sortDialog.getContext().getString(R.string.invoices))));
        abstractC1379l2.f29234s.setText(D9.b.l(sortDialog.getContext().getString(R.string.lowest_value_first, sortDialog.getContext().getString(R.string.invoices))));
        abstractC1379l2.f29238w.setImageResource(R.drawable.ic_calendar_old);
        ImageView imageView = abstractC1379l2.f29241z;
        imageView.setImageResource(R.drawable.ic_calendar_new);
        ImageView imageView2 = abstractC1379l2.f29232q;
        imageView2.setImageResource(R.drawable.ic_stocks_low);
        ImageView imageView3 = abstractC1379l2.f29235t;
        imageView3.setImageResource(R.drawable.ic_stocks_hight);
        int i = status == null ? -1 : SortDialog.a.f13223a[status.ordinal()];
        int i9 = 1;
        if (i == 1) {
            ImageView imageView4 = abstractC1379l2.f29238w;
            imageView4.setBackgroundResource(R.drawable.circle_black);
            imageView4.setColorFilter(C0913a.getColor(sortDialog.getContext(), R.color.white), PorterDuff.Mode.SRC_IN);
        } else if (i == 2) {
            imageView.setBackgroundResource(R.drawable.circle_black);
            imageView.setColorFilter(C0913a.getColor(sortDialog.getContext(), R.color.white), PorterDuff.Mode.SRC_IN);
        } else if (i == 3) {
            imageView2.setBackgroundResource(R.drawable.circle_black);
            imageView2.setColorFilter(C0913a.getColor(sortDialog.getContext(), R.color.white), PorterDuff.Mode.SRC_IN);
        } else if (i == 4) {
            imageView3.setBackgroundResource(R.drawable.circle_black);
            imageView3.setColorFilter(C0913a.getColor(sortDialog.getContext(), R.color.white), PorterDuff.Mode.SRC_IN);
        }
        sortDialog.f13212s = direction;
        int ordinal = direction.ordinal();
        if (ordinal == 0) {
            i9 = 0;
        } else if (ordinal == 1) {
            i9 = 2;
        } else if (ordinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        TabLayout.g h9 = abstractC1379l2.f29227A.h(i9);
        if (h9 != null) {
            h9.a();
        }
    }

    public final void L0() {
        CustomToolbarView.State state = this.f11464f0;
        int i = state == null ? -1 : a.f11478a[state.ordinal()];
        ToolbarStatus Q02 = i != 1 ? i != 2 ? Q0() : this.f11467i0 ? Q0() : R0() : Q0();
        this.f11468j0 = Q02;
        if (Q02 != null) {
            ((BaseActivity) requireActivity()).z(Q02, this.f11464f0);
        }
    }

    public final void M0(int i) {
        ((BaseActivity) requireActivity()).v(i);
    }

    public final void N0(String str, InterfaceC0635a<p> interfaceC0635a) {
        Uri uriForFile;
        try {
            if (str.startsWith("content://")) {
                uriForFile = Uri.parse(str);
            } else {
                File file = new File(str);
                if (!file.exists()) {
                    interfaceC0635a.invoke();
                    return;
                }
                uriForFile = FileProvider.getUriForFile(requireContext(), requireContext().getPackageName() + ".provider", file);
            }
            String type = requireContext().getContentResolver().getType(uriForFile);
            if (type == null) {
                type = "*/*";
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uriForFile, type);
            intent.addFlags(1);
            if (intent.resolveActivity(requireActivity().getPackageManager()) != null) {
                requireActivity().startActivity(intent);
                return;
            }
            Intent intent2 = new Intent("android.intent.action.SEND");
            intent2.putExtra("android.intent.extra.STREAM", uriForFile);
            intent2.setType(type);
            intent2.addFlags(1);
            requireActivity().startActivity(Intent.createChooser(intent2, "Share file"));
        } catch (Exception e10) {
            interfaceC0635a.invoke();
            e10.printStackTrace();
        }
    }

    public ToolbarStatus Q0() {
        ToolbarStatus.f13259v.getClass();
        ToolbarStatus.a.a();
        return ToolbarStatus.gone;
    }

    public ToolbarStatus R0() {
        return null;
    }

    public final void S0(VibrateType vibrateType) {
        VibrationEffect createOneShot;
        Vibrator vibrator = (Vibrator) requireContext().getSystemService("vibrator");
        if (Build.VERSION.SDK_INT >= 29) {
            int ordinal = vibrateType.ordinal();
            if (ordinal == 0) {
                createOneShot = VibrationEffect.createOneShot(1000L, -1);
            } else if (ordinal == 1) {
                createOneShot = VibrationEffect.createPredefined(0);
            } else if (ordinal == 2) {
                createOneShot = VibrationEffect.createPredefined(1);
            } else if (ordinal == 3) {
                createOneShot = VibrationEffect.createPredefined(2);
            } else {
                if (ordinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                createOneShot = VibrationEffect.createPredefined(5);
            }
            vibrator.cancel();
            vibrator.vibrate(createOneShot);
        }
    }

    public final void o0() {
        ActivityC0533g activity;
        ((BaseActivity) requireActivity()).s();
        if (this.f11467i0) {
            this.f11464f0 = CustomToolbarView.State.f13256a;
            t0(true);
        }
        View view = getView();
        if (view != null && (activity = getActivity()) != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        L0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f11469k0 = (T) F0.d.b(layoutInflater, v0(), viewGroup, false, null);
        return u0().f1148d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        s0();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (w0().a()) {
            w0().dismiss();
        }
        this.f11469k0 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        ActivityC0533g requireActivity = requireActivity();
        View currentFocus = requireActivity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(requireActivity);
        }
        ((InputMethodManager) requireActivity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        BaseActivity baseActivity = (BaseActivity) requireActivity();
        MainActivity mainActivity = baseActivity instanceof MainActivity ? (MainActivity) baseActivity : null;
        if (mainActivity != null) {
            mainActivity.f11407E = null;
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0();
        BaseActivity baseActivity = (BaseActivity) requireActivity();
        MainActivity mainActivity = baseActivity instanceof MainActivity ? (MainActivity) baseActivity : null;
        if (mainActivity != null) {
            mainActivity.f11407E = new B6.f(this, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        FragmentManager childFragmentManager;
        List<Fragment> f10;
        J8.d<p> dVar;
        C0559z<b.e> c0559z;
        C0559z<b.f> c0559z2;
        J8.d<p> dVar2;
        J8.d dVar3;
        J8.d<p> dVar4;
        J8.d<p> dVar5;
        super.onViewCreated(view, bundle);
        ActivityC0533g activity = getActivity();
        if (activity == null) {
            return;
        }
        i iVar = this.f11471m0;
        if (iVar != null && (dVar5 = iVar.f415G0) != null) {
            final int i = 0;
            dVar5.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar2 = baseFragment.f11471m0;
                            if (iVar2 != null && (dVar6 = iVar2.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar3 = baseFragment3.f11471m0;
                            if (iVar3 != null && (c0559z3 = iVar3.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar4 = baseFragment4.f11471m0;
                            if (iVar4 != null && (c0559z4 = iVar4.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        i iVar2 = this.f11471m0;
        if (iVar2 != null && (dVar4 = iVar2.f416H0) != null) {
            final int i9 = 1;
            dVar4.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i9) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar3 = baseFragment3.f11471m0;
                            if (iVar3 != null && (c0559z3 = iVar3.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar4 = baseFragment4.f11471m0;
                            if (iVar4 != null && (c0559z4 = iVar4.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        i iVar3 = this.f11471m0;
        if (iVar3 != null && (dVar3 = iVar3.f417I0) != null) {
            final int i10 = 2;
            dVar3.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i10) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar32 = baseFragment3.f11471m0;
                            if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar4 = baseFragment4.f11471m0;
                            if (iVar4 != null && (c0559z4 = iVar4.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        final int i11 = 3;
        new KeyboardTriggerBehavior(activity).observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseFragment f404b;

            {
                this.f404b = this;
            }

            @Override // ca.InterfaceC0646l
            public final Object invoke(Object obj) {
                J8.d dVar6;
                C0559z<b.f> c0559z3;
                C0559z<b.e> c0559z4;
                switch (i11) {
                    case 0:
                        ((K8.a) this.f404b.f11470l0.getValue()).a();
                        return p.f3034a;
                    case 1:
                        ((K8.a) this.f404b.f11470l0.getValue()).c();
                        return p.f3034a;
                    case 2:
                        String str = (String) obj;
                        if (str == null) {
                            return p.f3034a;
                        }
                        BaseFragment baseFragment = this.f404b;
                        ActivityC0533g requireActivity = baseFragment.requireActivity();
                        BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                        if (baseActivity != null) {
                            baseActivity.x(str);
                        }
                        i iVar22 = baseFragment.f11471m0;
                        if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                            dVar6.postValue(null);
                        }
                        return p.f3034a;
                    case 3:
                        int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                        BaseFragment baseFragment2 = this.f404b;
                        if (ordinal == 0) {
                            baseFragment2.z0();
                        } else {
                            if (ordinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            baseFragment2.y0();
                        }
                        return p.f3034a;
                    case 4:
                        ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                        ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                        MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                        if (mainActivity != null) {
                            Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                            mainActivity.finishAffinity();
                            mainActivity.startActivity(intent);
                            if (Build.VERSION.SDK_INT >= 34) {
                                mainActivity.overrideActivityTransition(0, 0, 0);
                            } else {
                                mainActivity.overridePendingTransition(0, 0);
                            }
                        }
                        return p.f3034a;
                    case 5:
                        if (((b.f) obj) == null) {
                            return p.f3034a;
                        }
                        BaseFragment baseFragment3 = this.f404b;
                        baseFragment3.getClass();
                        U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                        i iVar32 = baseFragment3.f11471m0;
                        if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                            c0559z3.postValue(null);
                        }
                        return p.f3034a;
                    case 6:
                        if (((b.e) obj) == null) {
                            return p.f3034a;
                        }
                        BaseFragment baseFragment4 = this.f404b;
                        baseFragment4.getClass();
                        U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                        i iVar4 = baseFragment4.f11471m0;
                        if (iVar4 != null && (c0559z4 = iVar4.f412D0) != null) {
                            c0559z4.postValue(null);
                        }
                        return p.f3034a;
                    default:
                        U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                        return p.f3034a;
                }
            }
        }));
        i iVar4 = this.f11471m0;
        if (iVar4 != null && (dVar2 = iVar4.f428p) != null) {
            final int i12 = 4;
            dVar2.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i12) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar32 = baseFragment3.f11471m0;
                            if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar42 = baseFragment4.f11471m0;
                            if (iVar42 != null && (c0559z4 = iVar42.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        i iVar5 = this.f11471m0;
        if (iVar5 != null && (c0559z2 = iVar5.f411C0) != null) {
            final int i13 = 5;
            c0559z2.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i13) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar32 = baseFragment3.f11471m0;
                            if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar42 = baseFragment4.f11471m0;
                            if (iVar42 != null && (c0559z4 = iVar42.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        i iVar6 = this.f11471m0;
        if (iVar6 != null && (c0559z = iVar6.f412D0) != null) {
            final int i14 = 6;
            c0559z.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i14) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar32 = baseFragment3.f11471m0;
                            if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar42 = baseFragment4.f11471m0;
                            if (iVar42 != null && (c0559z4 = iVar42.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        i iVar7 = this.f11471m0;
        if (iVar7 != null && (dVar = iVar7.f410B0) != null) {
            final int i15 = 7;
            dVar.observe(getViewLifecycleOwner(), new b(new InterfaceC0646l(this) { // from class: B6.e

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BaseFragment f404b;

                {
                    this.f404b = this;
                }

                @Override // ca.InterfaceC0646l
                public final Object invoke(Object obj) {
                    J8.d dVar6;
                    C0559z<b.f> c0559z3;
                    C0559z<b.e> c0559z4;
                    switch (i15) {
                        case 0:
                            ((K8.a) this.f404b.f11470l0.getValue()).a();
                            return p.f3034a;
                        case 1:
                            ((K8.a) this.f404b.f11470l0.getValue()).c();
                            return p.f3034a;
                        case 2:
                            String str = (String) obj;
                            if (str == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment = this.f404b;
                            ActivityC0533g requireActivity = baseFragment.requireActivity();
                            BaseActivity baseActivity = requireActivity instanceof BaseActivity ? (BaseActivity) requireActivity : null;
                            if (baseActivity != null) {
                                baseActivity.x(str);
                            }
                            i iVar22 = baseFragment.f11471m0;
                            if (iVar22 != null && (dVar6 = iVar22.f417I0) != null) {
                                dVar6.postValue(null);
                            }
                            return p.f3034a;
                        case 3:
                            int ordinal = ((KeyboardTriggerBehavior.Status) obj).ordinal();
                            BaseFragment baseFragment2 = this.f404b;
                            if (ordinal == 0) {
                                baseFragment2.z0();
                            } else {
                                if (ordinal != 1) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                baseFragment2.y0();
                            }
                            return p.f3034a;
                        case 4:
                            ((K5.a) org.koin.java.a.a(K5.a.class).getValue()).p();
                            ActivityC0533g requireActivity2 = this.f404b.requireActivity();
                            MainActivity mainActivity = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
                            if (mainActivity != null) {
                                Intent intent = new Intent(mainActivity, (Class<?>) MainActivity.class);
                                mainActivity.finishAffinity();
                                mainActivity.startActivity(intent);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    mainActivity.overrideActivityTransition(0, 0, 0);
                                } else {
                                    mainActivity.overridePendingTransition(0, 0);
                                }
                            }
                            return p.f3034a;
                        case 5:
                            if (((b.f) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment3 = this.f404b;
                            baseFragment3.getClass();
                            U4.b.g(baseFragment3).i(R.id.action_global_tfaFragment, null);
                            i iVar32 = baseFragment3.f11471m0;
                            if (iVar32 != null && (c0559z3 = iVar32.f411C0) != null) {
                                c0559z3.postValue(null);
                            }
                            return p.f3034a;
                        case 6:
                            if (((b.e) obj) == null) {
                                return p.f3034a;
                            }
                            BaseFragment baseFragment4 = this.f404b;
                            baseFragment4.getClass();
                            U4.b.g(baseFragment4).i(R.id.action_global_tfaFragment, null);
                            i iVar42 = baseFragment4.f11471m0;
                            if (iVar42 != null && (c0559z4 = iVar42.f412D0) != null) {
                                c0559z4.postValue(null);
                            }
                            return p.f3034a;
                        default:
                            U4.b.g(this.f404b).i(R.id.action_global_serverErrorFragment, null);
                            return p.f3034a;
                    }
                }
            }));
        }
        ActivityC0533g requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            mainActivity.F();
        }
        if (this.f11464f0 == CustomToolbarView.State.f13256a) {
            t0(false);
        } else {
            p0(false);
        }
        L0();
        BaseActivity baseActivity = (BaseActivity) requireActivity();
        baseActivity.f11454n = x0();
        baseActivity.y();
        ((BaseActivity) requireActivity()).f11455o = this;
        ActivityC0533g requireActivity2 = requireActivity();
        MainActivity mainActivity2 = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
        if (mainActivity2 != null) {
            ToolbarStatus toolbarStatus = this.f11468j0;
            if (toolbarStatus != null) {
                Object obj = mainActivity2.f11453m;
                if (obj == null) {
                    obj = null;
                }
                ((AbstractC1296b) obj).f28803r.setStatus(toolbarStatus);
            }
            Fragment F10 = mainActivity2.getSupportFragmentManager().F(R.id.nav_host_fragment);
            BaseFragment baseFragment = (BaseFragment) ((F10 == null || (childFragmentManager = F10.getChildFragmentManager()) == null || (f10 = childFragmentManager.f6735c.f()) == null) ? null : f10.get(0));
            CustomToolbarView.State state = mainActivity2.f11416x;
            baseFragment.f11464f0 = state;
            Object obj2 = mainActivity2.f11453m;
            ((AbstractC1296b) (obj2 != null ? obj2 : null)).f28803r.setState(state);
            baseFragment.L0();
        }
        if (this instanceof TfaFragment) {
            return;
        }
        E.b(this, "TFA", new B6.h(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(boolean z10) {
        ActivityC0533g requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            Object obj = mainActivity.f11453m;
            ((AbstractC1296b) (obj != null ? obj : null)).f28799n.f(false, z10, true);
        }
        this.f11464f0 = CustomToolbarView.State.f13257b;
        L0();
    }

    public final void r0(String str) {
        ClipboardManager clipboardManager = (ClipboardManager) requireContext().getSystemService("clipboard");
        ClipData newPlainText = ClipData.newPlainText(getString(R.string.app_name), str);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        P0(this, getString(R.string.copied));
        S0(VibrateType.f11475a);
    }

    public final void s0() {
        AppBarLayout appBarLayout;
        ViewGroup.LayoutParams layoutParams;
        ActivityC0533g requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            Object obj = mainActivity.f11453m;
            if (obj == null) {
                obj = null;
            }
            appBarLayout = ((AbstractC1296b) obj).f28799n;
        } else {
            appBarLayout = null;
        }
        if (appBarLayout != null) {
            appBarLayout.setActivated(false);
        }
        if (appBarLayout != null && (layoutParams = appBarLayout.getLayoutParams()) != null) {
            layoutParams.height = (int) D9.b.T(87);
        }
        ActivityC0533g requireActivity2 = requireActivity();
        MainActivity mainActivity2 = requireActivity2 instanceof MainActivity ? (MainActivity) requireActivity2 : null;
        if (mainActivity2 != null) {
            mainActivity2.f11417y = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0(boolean z10) {
        ActivityC0533g requireActivity = requireActivity();
        MainActivity mainActivity = requireActivity instanceof MainActivity ? (MainActivity) requireActivity : null;
        if (mainActivity != null) {
            Object obj = mainActivity.f11453m;
            ((AbstractC1296b) (obj != null ? obj : null)).f28799n.f(true, z10, true);
        }
        this.f11464f0 = CustomToolbarView.State.f13256a;
        L0();
    }

    public final T u0() {
        T t3 = this.f11469k0;
        if (t3 != null) {
            return t3;
        }
        throw new IllegalStateException("Binding is null".toString());
    }

    public abstract int v0();

    public final D8.a w0() {
        return (D8.a) this.f11465g0.getValue();
    }

    public boolean x0() {
        return this.f11466h0;
    }

    @Override // B6.a
    public void m0() {
    }

    public void y0() {
    }

    public void z0() {
    }

    public void D0(Date date, Date date2) {
    }

    public void E0(SortDialog.Status status, SortDialog.Direction direction) {
    }

    public void F0(SortStatisticsDialog.StatisticType statisticType, Long l10, Long l11) {
    }
}
