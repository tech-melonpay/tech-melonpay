package com.chuckerteam.chucker.internal.ui.transaction;

import B6.g;
import O9.f;
import P9.s;
import P9.u;
import P9.v;
import S1.i;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.ActivityC0533g;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.A;
import androidx.lifecycle.C0552s;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment;
import com.chuckerteam.chucker.internal.ui.transaction.a;
import com.chuckerteam.chucker.internal.ui.transaction.d;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.luminary.mobile.R;
import e.AbstractC0704c;
import e.InterfaceC0702a;
import f.C0729b;
import ja.o;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import k0.C0913a;
import ka.C0956a;
import ka.C0969n;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.h;
import kotlin.text.Regex;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: TransactionPayloadFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionPayloadFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/appcompat/widget/SearchView$k;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionPayloadFragment extends Fragment implements SearchView.k {

    /* renamed from: i0, reason: collision with root package name */
    public H1.c f8740i0;

    /* renamed from: f0, reason: collision with root package name */
    public final H1.a f8737f0 = new H1.a(h.a(U1.h.class), new InterfaceC0635a<W>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final W invoke() {
            return Fragment.this.requireActivity().getViewModelStore();
        }
    }, new g(6), new InterfaceC0635a<R0.a>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final R0.a invoke() {
            return Fragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    /* renamed from: g0, reason: collision with root package name */
    public final f f8738g0 = kotlin.a.b(LazyThreadSafetyMode.f23087c, new A8.b(this, 15));

    /* renamed from: h0, reason: collision with root package name */
    public final AbstractC0704c<String> f8739h0 = registerForActivityResult(new C0729b("*/*"), new InterfaceC0702a() { // from class: com.chuckerteam.chucker.internal.ui.transaction.c
        @Override // e.InterfaceC0702a
        public final void a(Object obj) {
            Uri uri = (Uri) obj;
            TransactionPayloadFragment transactionPayloadFragment = TransactionPayloadFragment.this;
            HttpTransaction value = transactionPayloadFragment.p0().f3655E0.getValue();
            Context applicationContext = transactionPayloadFragment.requireContext().getApplicationContext();
            if (uri == null || value == null) {
                Toast.makeText(applicationContext, R.string.chucker_save_failed_to_open_document, 0).show();
            } else {
                BuildersKt__Builders_commonKt.launch$default(C0552s.a(transactionPayloadFragment), null, null, new TransactionPayloadFragment$saveToFile$1$1(uri, applicationContext, transactionPayloadFragment, value, null), 3, null);
            }
        }
    });

    /* renamed from: j0, reason: collision with root package name */
    public final com.chuckerteam.chucker.internal.ui.transaction.a f8741j0 = new com.chuckerteam.chucker.internal.ui.transaction.a(new TransactionPayloadFragment$payloadAdapter$1(0, this, TransactionPayloadFragment.class, "copyResponse", "copyResponse()V", 0));

    /* renamed from: k0, reason: collision with root package name */
    public int f8742k0 = -256;

    /* renamed from: l0, reason: collision with root package name */
    public int f8743l0 = -65536;

    /* renamed from: m0, reason: collision with root package name */
    public final int f8744m0 = -16711936;

    /* renamed from: n0, reason: collision with root package name */
    public final ArrayList<a.C0097a> f8745n0 = new ArrayList<>();

    /* renamed from: o0, reason: collision with root package name */
    public int f8746o0 = -1;

    /* renamed from: p0, reason: collision with root package name */
    public String f8747p0 = "";

    /* compiled from: TransactionPayloadFragment.kt */
    public static final class a implements A, kotlin.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0646l f8751a;

        public a(C7.a aVar) {
            this.f8751a = aVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof A) && (obj instanceof kotlin.jvm.internal.d)) {
                return kotlin.jvm.internal.f.b(getFunctionDelegate(), ((kotlin.jvm.internal.d) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.d
        public final O9.d<?> getFunctionDelegate() {
            return this.f8751a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.A
        public final /* synthetic */ void onChanged(Object obj) {
            this.f8751a.invoke(obj);
        }
    }

    public static final Ka.d c(TransactionPayloadFragment transactionPayloadFragment, PayloadType payloadType, HttpTransaction httpTransaction) {
        int ordinal = payloadType.ordinal();
        if (ordinal == 0) {
            String requestBody = httpTransaction.getRequestBody();
            if (requestBody != null) {
                return Ja.a.C(new ByteArrayInputStream(requestBody.getBytes(C0956a.f23054b)));
            }
            throw new IOException("Transaction not ready");
        }
        if (ordinal != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String responseBody = httpTransaction.getResponseBody();
        if (responseBody != null) {
            return Ja.a.C(new ByteArrayInputStream(responseBody.getBytes(C0956a.f23054b)));
        }
        throw new IOException("Transaction not ready");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.widget.SearchView.k
    public final void b(String str) {
        ArrayList<a.C0097a> arrayList = this.f8745n0;
        arrayList.clear();
        this.f8747p0 = str;
        this.f8746o0 = -1;
        boolean z10 = !C0969n.i0(str);
        com.chuckerteam.chucker.internal.ui.transaction.a aVar = this.f8741j0;
        if (!z10 || str.length() <= 1) {
            aVar.f();
            q0(false);
        } else {
            int i = this.f8742k0;
            int i9 = this.f8743l0;
            aVar.getClass();
            ArrayList arrayList2 = new ArrayList();
            ArrayList<d> arrayList3 = aVar.f8772e;
            ArrayList arrayList4 = new ArrayList();
            Iterator<d> it = arrayList3.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next instanceof d.a) {
                    arrayList4.add(next);
                }
            }
            v vVar = new v(arrayList4.iterator(), 0);
            while (((Iterator) vVar.f3168c).hasNext()) {
                u uVar = (u) vVar.next();
                d.a aVar2 = (d.a) uVar.f3165b;
                o oVar = new o(Regex.a(new Regex(Pattern.compile(str, 2)), aVar2.f8777a), new Q3.a(10));
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = oVar.iterator();
                while (true) {
                    o.a aVar3 = (o.a) it2;
                    if (!aVar3.hasNext()) {
                        break;
                    } else {
                        arrayList5.add(aVar3.next());
                    }
                }
                boolean z11 = !arrayList5.isEmpty();
                int i10 = uVar.f3164a;
                if (z11) {
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new a.C0097a(i10 + 1, ((Number) it3.next()).intValue()));
                    }
                    com.chuckerteam.chucker.internal.ui.transaction.a.d(aVar2.f8777a);
                    SpannableStringBuilder spannableStringBuilder = aVar2.f8777a;
                    int length = str.length();
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        Ja.a.d(spannableStringBuilder, ((Number) it4.next()).intValue(), length, i, i9);
                    }
                    aVar2.f8777a = spannableStringBuilder;
                    aVar.notifyItemChanged(i10 + 1);
                } else if (com.chuckerteam.chucker.internal.ui.transaction.a.d(aVar2.f8777a) > 0) {
                    aVar.notifyItemChanged(i10 + 1);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            } else {
                aVar.f();
                q0(false);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(C0552s.a(this), null, null, new TransactionPayloadFragment$onQueryTextChange$1(this, null), 3, null);
    }

    public final void d(String str, String str2, String str3) {
        ActivityC0533g activity = getActivity();
        ((ClipboardManager) (activity != null ? activity.getSystemService("clipboard") : null)).setPrimaryClip(ClipData.newPlainText(str2, str));
        Toast.makeText(getActivity(), str3, 1).show();
    }

    @Override // androidx.appcompat.widget.SearchView.k
    public final boolean n0() {
        return false;
    }

    public final PayloadType o0() {
        return (PayloadType) this.f8738g0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f8742k0 = C0913a.getColor(context, R.color.chucker_background_span_color);
        this.f8743l0 = C0913a.getColor(context, R.color.chucker_foreground_span_color);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if (0 != r1.longValue()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004e, code lost:
    
        if (0 != r1.longValue()) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    @Override // androidx.fragment.app.Fragment
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreateOptionsMenu(android.view.Menu r8, android.view.MenuInflater r9) {
        /*
            r7 = this;
            U1.h r0 = r7.p0()
            androidx.lifecycle.x<com.chuckerteam.chucker.internal.data.entity.HttpTransaction> r0 = r0.f3655E0
            java.lang.Object r0 = r0.getValue()
            com.chuckerteam.chucker.internal.data.entity.HttpTransaction r0 = (com.chuckerteam.chucker.internal.data.entity.HttpTransaction) r0
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r1 = r7.o0()
            int r1 = r1.ordinal()
            r2 = 0
            r4 = 1
            if (r1 == 0) goto L39
            if (r1 != r4) goto L33
            if (r0 == 0) goto L66
            boolean r1 = r0.getIsResponseBodyEncoded()
            if (r1 != 0) goto L66
            java.lang.Long r1 = r0.getResponsePayloadSize()
            if (r1 != 0) goto L2a
            goto L50
        L2a:
            long r5 = r1.longValue()
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L66
            goto L50
        L33:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L39:
            if (r0 == 0) goto L66
            boolean r1 = r0.getIsRequestBodyEncoded()
            if (r1 != 0) goto L66
            java.lang.Long r1 = r0.getRequestPayloadSize()
            if (r1 != 0) goto L48
            goto L50
        L48:
            long r5 = r1.longValue()
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L66
        L50:
            r1 = 2131363257(0x7f0a05b9, float:1.8346318E38)
            android.view.MenuItem r1 = r8.findItem(r1)
            r1.setVisible(r4)
            android.view.View r1 = r1.getActionView()
            androidx.appcompat.widget.SearchView r1 = (androidx.appcompat.widget.SearchView) r1
            r1.setOnQueryTextListener(r7)
            r1.setIconifiedByDefault(r4)
        L66:
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r1 = r7.o0()
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r5 = com.chuckerteam.chucker.internal.ui.transaction.PayloadType.f8711a
            if (r1 != r5) goto L80
            if (r0 == 0) goto L9a
            java.lang.Long r0 = r0.getRequestPayloadSize()
            if (r0 != 0) goto L77
            goto L9a
        L77:
            long r0 = r0.longValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9a
            goto Lad
        L80:
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r1 = r7.o0()
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r6 = com.chuckerteam.chucker.internal.ui.transaction.PayloadType.f8712b
            if (r1 != r6) goto L9a
            if (r0 == 0) goto L9a
            java.lang.Long r0 = r0.getResponsePayloadSize()
            if (r0 != 0) goto L91
            goto L9a
        L91:
            long r0 = r0.longValue()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L9a
            goto Lad
        L9a:
            r0 = 2131363242(0x7f0a05aa, float:1.8346287E38)
            android.view.MenuItem r0 = r8.findItem(r0)
            r0.setVisible(r4)
            U1.c r1 = new U1.c
            r2 = 1
            r1.<init>(r7, r2)
            r0.setOnMenuItemClickListener(r1)
        Lad:
            com.chuckerteam.chucker.internal.ui.transaction.PayloadType r0 = r7.o0()
            if (r0 != r5) goto Lcd
            U1.h r0 = r7.p0()
            androidx.lifecycle.r r1 = r7.getViewLifecycleOwner()
            C7.a r2 = new C7.a
            r3 = 11
            r2.<init>(r8, r3)
            com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$a r3 = new com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment$a
            r3.<init>(r2)
            androidx.lifecycle.y r0 = r0.f3654D0
            r0.observe(r1, r3)
            goto Ld8
        Lcd:
            r0 = 2131362585(0x7f0a0319, float:1.8344955E38)
            android.view.MenuItem r0 = r8.findItem(r0)
            r1 = 0
            r0.setVisible(r1)
        Ld8:
            super.onCreateOptionsMenu(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.ui.transaction.TransactionPayloadFragment.onCreateOptionsMenu(android.view.Menu, android.view.MenuInflater):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.chucker_fragment_transaction_payload, viewGroup, false);
        int i = R.id.emptyPayloadImage;
        if (((ImageView) j3.e.q(R.id.emptyPayloadImage, inflate)) != null) {
            i = R.id.emptyPayloadTextView;
            TextView textView = (TextView) j3.e.q(R.id.emptyPayloadTextView, inflate);
            if (textView != null) {
                i = R.id.emptyStateGroup;
                Group group = (Group) j3.e.q(R.id.emptyStateGroup, inflate);
                if (group != null) {
                    i = R.id.loadingProgress;
                    CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) j3.e.q(R.id.loadingProgress, inflate);
                    if (circularProgressIndicator != null) {
                        i = R.id.payloadRecyclerView;
                        RecyclerView recyclerView = (RecyclerView) j3.e.q(R.id.payloadRecyclerView, inflate);
                        if (recyclerView != null) {
                            i = R.id.rootSearchSummary;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) j3.e.q(R.id.rootSearchSummary, inflate);
                            if (linearLayoutCompat != null) {
                                i = R.id.searchNavButton;
                                ImageButton imageButton = (ImageButton) j3.e.q(R.id.searchNavButton, inflate);
                                if (imageButton != null) {
                                    i = R.id.searchNavButtonUp;
                                    ImageButton imageButton2 = (ImageButton) j3.e.q(R.id.searchNavButtonUp, inflate);
                                    if (imageButton2 != null) {
                                        i = R.id.searchSummary;
                                        TextView textView2 = (TextView) j3.e.q(R.id.searchSummary, inflate);
                                        if (textView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                            this.f8740i0 = new H1.c(constraintLayout, textView, group, circularProgressIndicator, recyclerView, linearLayoutCompat, imageButton, imageButton2, textView2);
                                            return constraintLayout;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        H1.c cVar = this.f8740i0;
        if (cVar == null) {
            cVar = null;
        }
        RecyclerView recyclerView = (RecyclerView) cVar.f1442e;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(this.f8741j0);
        i.a(p0().f3655E0, p0().f3656F0, new K8.c(3)).observe(getViewLifecycleOwner(), new A() { // from class: com.chuckerteam.chucker.internal.ui.transaction.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.lifecycle.A
            public final void onChanged(Object obj) {
                Pair pair = (Pair) obj;
                HttpTransaction httpTransaction = (HttpTransaction) pair.f23089a;
                boolean booleanValue = ((Boolean) pair.f23090b).booleanValue();
                if (httpTransaction == null) {
                    return;
                }
                TransactionPayloadFragment transactionPayloadFragment = TransactionPayloadFragment.this;
                BuildersKt__Builders_commonKt.launch$default(C0552s.a(transactionPayloadFragment), null, null, new TransactionPayloadFragment$onViewCreated$2$1(transactionPayloadFragment, httpTransaction, booleanValue, null), 3, null);
            }
        });
        H1.c cVar2 = this.f8740i0;
        if (cVar2 == null) {
            cVar2 = null;
        }
        final int i = 0;
        ((ImageButton) cVar2.f1444g).setOnClickListener(new View.OnClickListener(this) { // from class: U1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionPayloadFragment f3651b;

            {
                this.f3651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        this.f3651b.r0(true);
                        break;
                    default:
                        this.f3651b.r0(false);
                        break;
                }
            }
        });
        H1.c cVar3 = this.f8740i0;
        final int i9 = 1;
        ((ImageButton) (cVar3 != null ? cVar3 : null).f1445h).setOnClickListener(new View.OnClickListener(this) { // from class: U1.g

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionPayloadFragment f3651b;

            {
                this.f3651b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        this.f3651b.r0(true);
                        break;
                    default:
                        this.f3651b.r0(false);
                        break;
                }
            }
        });
    }

    public final U1.h p0() {
        return (U1.h) this.f8737f0.getValue();
    }

    public final void q0(boolean z10) {
        H1.c cVar = this.f8740i0;
        if (cVar == null) {
            cVar = null;
        }
        ((LinearLayoutCompat) cVar.f1443f).setVisibility(z10 ? 0 : 8);
    }

    public final void r0(boolean z10) {
        View currentFocus;
        ActivityC0533g activity = getActivity();
        InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
        if (inputMethodManager.isAcceptingText()) {
            ActivityC0533g activity2 = getActivity();
            if (activity2 != null && (currentFocus = activity2.getCurrentFocus()) != null) {
                currentFocus.clearFocus();
            }
            View view = getView();
            inputMethodManager.hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
        }
        ArrayList<a.C0097a> arrayList = this.f8745n0;
        if (!arrayList.isEmpty()) {
            s0(z10 ? (this.f8746o0 + 1) % arrayList.size() : Math.abs(arrayList.size() + (this.f8746o0 - 1)) % arrayList.size());
        }
    }

    public final void s0(int i) {
        ArrayList<a.C0097a> arrayList = this.f8745n0;
        a.C0097a c0097a = (a.C0097a) s.M(this.f8746o0, arrayList);
        if (c0097a != null) {
            this.f8741j0.e(this.f8747p0, c0097a.f8773a, c0097a.f8774b, this.f8742k0, this.f8743l0);
        }
        this.f8746o0 = i;
        a.C0097a c0097a2 = (a.C0097a) s.M(i, arrayList);
        if (c0097a2 != null) {
            this.f8741j0.e(this.f8747p0, c0097a2.f8773a, c0097a2.f8774b, this.f8744m0, this.f8743l0);
            int size = arrayList.size();
            int i9 = i + 1;
            H1.c cVar = this.f8740i0;
            if (cVar == null) {
                cVar = null;
            }
            TextView textView = (TextView) cVar.f1439b;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            StyleSpan styleSpan = new StyleSpan(1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) (i9 + " / " + size));
            spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
            textView.setText(spannableStringBuilder);
            q0(true);
            H1.c cVar2 = this.f8740i0;
            ((RecyclerView) (cVar2 != null ? cVar2 : null).f1442e).smoothScrollToPosition(c0097a2.f8773a);
            this.f8746o0 = i;
        }
    }
}
