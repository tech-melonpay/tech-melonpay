package U1;

import O9.p;
import S1.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.C;
import androidx.recyclerview.widget.RecyclerView;
import ca.InterfaceC0646l;
import com.luminary.mobile.R;
import k0.C0913a;

/* compiled from: TransactionAdapter.kt */
/* loaded from: classes.dex */
public final class e extends C<com.chuckerteam.chucker.internal.data.entity.a, a> {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0646l<Long, p> f3641e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3642f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3643g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3644h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3645j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3646k;

    /* compiled from: TransactionAdapter.kt */
    public final class a extends RecyclerView.C {

        /* renamed from: e, reason: collision with root package name */
        public final H1.d f3647e;

        /* renamed from: f, reason: collision with root package name */
        public Long f3648f;

        public a(H1.d dVar) {
            super(dVar.f1446a);
            this.f3647e = dVar;
            this.itemView.setOnClickListener(new B7.f(7, this, e.this));
        }
    }

    public e(Context context, T1.b bVar) {
        super(n.f3363a);
        this.f3641e = bVar;
        this.f3642f = C0913a.getColor(context, R.color.chucker_status_default);
        this.f3643g = C0913a.getColor(context, R.color.chucker_status_requested);
        this.f3644h = C0913a.getColor(context, R.color.chucker_status_error);
        this.i = C0913a.getColor(context, R.color.chucker_status_500);
        this.f3645j = C0913a.getColor(context, R.color.chucker_status_400);
        this.f3646k = C0913a.getColor(context, R.color.chucker_status_300);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C r10, int r11) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.e.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$C, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.chucker_list_item_transaction, viewGroup, false);
        int i9 = R.id.code;
        TextView textView = (TextView) j3.e.q(R.id.code, inflate);
        if (textView != null) {
            i9 = R.id.duration;
            TextView textView2 = (TextView) j3.e.q(R.id.duration, inflate);
            if (textView2 != null) {
                i9 = R.id.graphqlIcon;
                ImageView imageView = (ImageView) j3.e.q(R.id.graphqlIcon, inflate);
                if (imageView != null) {
                    i9 = R.id.graphqlPath;
                    TextView textView3 = (TextView) j3.e.q(R.id.graphqlPath, inflate);
                    if (textView3 != null) {
                        i9 = R.id.guideline;
                        if (((Guideline) j3.e.q(R.id.guideline, inflate)) != null) {
                            i9 = R.id.host;
                            TextView textView4 = (TextView) j3.e.q(R.id.host, inflate);
                            if (textView4 != null) {
                                i9 = R.id.path;
                                TextView textView5 = (TextView) j3.e.q(R.id.path, inflate);
                                if (textView5 != null) {
                                    i9 = R.id.size;
                                    TextView textView6 = (TextView) j3.e.q(R.id.size, inflate);
                                    if (textView6 != null) {
                                        i9 = R.id.ssl;
                                        ImageView imageView2 = (ImageView) j3.e.q(R.id.ssl, inflate);
                                        if (imageView2 != null) {
                                            i9 = R.id.timeStart;
                                            TextView textView7 = (TextView) j3.e.q(R.id.timeStart, inflate);
                                            if (textView7 != null) {
                                                return new a(new H1.d((ConstraintLayout) inflate, textView, textView2, imageView, textView3, textView4, textView5, textView6, imageView2, textView7));
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
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
    }
}
