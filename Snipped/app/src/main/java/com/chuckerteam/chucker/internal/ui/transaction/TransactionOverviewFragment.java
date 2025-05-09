package com.chuckerteam.chucker.internal.ui.transaction;

import B6.g;
import S1.i;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.W;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import kotlin.Metadata;
import kotlin.jvm.internal.h;

/* compiled from: TransactionOverviewFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/chuckerteam/chucker/internal/ui/transaction/TransactionOverviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class TransactionOverviewFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final H1.a f8733f0 = new H1.a(h.a(U1.h.class), new InterfaceC0635a<W>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionOverviewFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final W invoke() {
            return Fragment.this.requireActivity().getViewModelStore();
        }
    }, new g(5), new InterfaceC0635a<R0.a>() { // from class: com.chuckerteam.chucker.internal.ui.transaction.TransactionOverviewFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // ca.InterfaceC0635a
        public final R0.a invoke() {
            return Fragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    /* renamed from: g0, reason: collision with root package name */
    public H1.b f8734g0;

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.findItem(R.id.save_body).setVisible(false);
        U1.h hVar = (U1.h) this.f8733f0.getValue();
        hVar.f3653C0.observe(getViewLifecycleOwner(), new U1.b(menu, 2));
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.chucker_fragment_transaction_overview, viewGroup, false);
        int i = R.id.barrierRequestSize;
        if (((Barrier) j3.e.q(R.id.barrierRequestSize, inflate)) != null) {
            i = R.id.barrierRequestTime;
            if (((Barrier) j3.e.q(R.id.barrierRequestTime, inflate)) != null) {
                i = R.id.barrierResponseSize;
                if (((Barrier) j3.e.q(R.id.barrierResponseSize, inflate)) != null) {
                    i = R.id.barrierResponseTime;
                    if (((Barrier) j3.e.q(R.id.barrierResponseTime, inflate)) != null) {
                        i = R.id.cipherSuite;
                        if (((TextView) j3.e.q(R.id.cipherSuite, inflate)) != null) {
                            i = R.id.cipherSuiteGroup;
                            Group group = (Group) j3.e.q(R.id.cipherSuiteGroup, inflate);
                            if (group != null) {
                                i = R.id.cipherSuiteValue;
                                TextView textView = (TextView) j3.e.q(R.id.cipherSuiteValue, inflate);
                                if (textView != null) {
                                    i = R.id.duration;
                                    TextView textView2 = (TextView) j3.e.q(R.id.duration, inflate);
                                    if (textView2 != null) {
                                        i = R.id.method;
                                        TextView textView3 = (TextView) j3.e.q(R.id.method, inflate);
                                        if (textView3 != null) {
                                            i = R.id.overviewGuideline;
                                            if (((Guideline) j3.e.q(R.id.overviewGuideline, inflate)) != null) {
                                                i = R.id.protocol;
                                                TextView textView4 = (TextView) j3.e.q(R.id.protocol, inflate);
                                                if (textView4 != null) {
                                                    i = R.id.requestSize;
                                                    TextView textView5 = (TextView) j3.e.q(R.id.requestSize, inflate);
                                                    if (textView5 != null) {
                                                        i = R.id.requestSizeLabel;
                                                        if (((TextView) j3.e.q(R.id.requestSizeLabel, inflate)) != null) {
                                                            i = R.id.requestTime;
                                                            TextView textView6 = (TextView) j3.e.q(R.id.requestTime, inflate);
                                                            if (textView6 != null) {
                                                                i = R.id.requestTimeLabel;
                                                                if (((TextView) j3.e.q(R.id.requestTimeLabel, inflate)) != null) {
                                                                    i = R.id.response;
                                                                    TextView textView7 = (TextView) j3.e.q(R.id.response, inflate);
                                                                    if (textView7 != null) {
                                                                        i = R.id.responseSize;
                                                                        TextView textView8 = (TextView) j3.e.q(R.id.responseSize, inflate);
                                                                        if (textView8 != null) {
                                                                            i = R.id.responseSizeLabel;
                                                                            if (((TextView) j3.e.q(R.id.responseSizeLabel, inflate)) != null) {
                                                                                i = R.id.responseTime;
                                                                                TextView textView9 = (TextView) j3.e.q(R.id.responseTime, inflate);
                                                                                if (textView9 != null) {
                                                                                    i = R.id.responseTimeLabel;
                                                                                    if (((TextView) j3.e.q(R.id.responseTimeLabel, inflate)) != null) {
                                                                                        i = R.id.ssl;
                                                                                        if (((TextView) j3.e.q(R.id.ssl, inflate)) != null) {
                                                                                            i = R.id.sslGroup;
                                                                                            Group group2 = (Group) j3.e.q(R.id.sslGroup, inflate);
                                                                                            if (group2 != null) {
                                                                                                i = R.id.sslValue;
                                                                                                TextView textView10 = (TextView) j3.e.q(R.id.sslValue, inflate);
                                                                                                if (textView10 != null) {
                                                                                                    i = R.id.status;
                                                                                                    TextView textView11 = (TextView) j3.e.q(R.id.status, inflate);
                                                                                                    if (textView11 != null) {
                                                                                                        i = R.id.tlsGroup;
                                                                                                        Group group3 = (Group) j3.e.q(R.id.tlsGroup, inflate);
                                                                                                        if (group3 != null) {
                                                                                                            i = R.id.tlsVersion;
                                                                                                            if (((TextView) j3.e.q(R.id.tlsVersion, inflate)) != null) {
                                                                                                                i = R.id.tlsVersionValue;
                                                                                                                TextView textView12 = (TextView) j3.e.q(R.id.tlsVersionValue, inflate);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.totalSize;
                                                                                                                    TextView textView13 = (TextView) j3.e.q(R.id.totalSize, inflate);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.url;
                                                                                                                        TextView textView14 = (TextView) j3.e.q(R.id.url, inflate);
                                                                                                                        if (textView14 != null) {
                                                                                                                            ScrollView scrollView = (ScrollView) inflate;
                                                                                                                            this.f8734g0 = new H1.b(scrollView, group, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, group2, textView10, textView11, group3, textView12, textView13, textView14);
                                                                                                                            return scrollView;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
        H1.a aVar = this.f8733f0;
        U1.h hVar = (U1.h) aVar.getValue();
        i.a(hVar.f3655E0, ((U1.h) aVar.getValue()).f3658p, new K8.c(3)).observe(getViewLifecycleOwner(), new U1.b(this, 3));
    }
}
