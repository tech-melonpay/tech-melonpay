package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.luminary.mobile.R;
import g.C0756a;
import h.DialogC0783j;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class AlertController {

    /* renamed from: A, reason: collision with root package name */
    public TextView f4593A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f4594B;

    /* renamed from: C, reason: collision with root package name */
    public View f4595C;

    /* renamed from: D, reason: collision with root package name */
    public ListAdapter f4596D;

    /* renamed from: F, reason: collision with root package name */
    public final int f4598F;

    /* renamed from: G, reason: collision with root package name */
    public final int f4599G;

    /* renamed from: H, reason: collision with root package name */
    public final int f4600H;

    /* renamed from: I, reason: collision with root package name */
    public final int f4601I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f4602J;

    /* renamed from: K, reason: collision with root package name */
    public final c f4603K;

    /* renamed from: a, reason: collision with root package name */
    public final Context f4605a;

    /* renamed from: b, reason: collision with root package name */
    public final DialogC0783j f4606b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f4607c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4608d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4609e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4610f;

    /* renamed from: g, reason: collision with root package name */
    public RecycleListView f4611g;

    /* renamed from: h, reason: collision with root package name */
    public View f4612h;
    public int i;

    /* renamed from: k, reason: collision with root package name */
    public Button f4614k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f4615l;

    /* renamed from: m, reason: collision with root package name */
    public Message f4616m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f4617n;

    /* renamed from: o, reason: collision with root package name */
    public Button f4618o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4619p;

    /* renamed from: q, reason: collision with root package name */
    public Message f4620q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f4621r;

    /* renamed from: s, reason: collision with root package name */
    public Button f4622s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f4623t;

    /* renamed from: u, reason: collision with root package name */
    public Message f4624u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f4625v;

    /* renamed from: w, reason: collision with root package name */
    public NestedScrollView f4626w;

    /* renamed from: y, reason: collision with root package name */
    public Drawable f4628y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f4629z;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4613j = false;

    /* renamed from: x, reason: collision with root package name */
    public int f4627x = 0;

    /* renamed from: E, reason: collision with root package name */
    public int f4597E = -1;

    /* renamed from: L, reason: collision with root package name */
    public final a f4604L = new a();

    public static class RecycleListView extends ListView {

        /* renamed from: a, reason: collision with root package name */
        public final int f4630a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4631b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0756a.f20747t);
            this.f4631b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f4630a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            Message obtain = (view != alertController.f4614k || (message3 = alertController.f4616m) == null) ? (view != alertController.f4618o || (message2 = alertController.f4620q) == null) ? (view != alertController.f4622s || (message = alertController.f4624u) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
            if (obtain != null) {
                obtain.sendToTarget();
            }
            alertController.f4603K.obtainMessage(1, alertController.f4606b).sendToTarget();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f4633a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4634b;

        /* renamed from: c, reason: collision with root package name */
        public Drawable f4635c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f4636d;

        /* renamed from: e, reason: collision with root package name */
        public View f4637e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f4638f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f4639g;

        /* renamed from: h, reason: collision with root package name */
        public DialogInterface.OnClickListener f4640h;
        public CharSequence i;

        /* renamed from: j, reason: collision with root package name */
        public DialogInterface.OnClickListener f4641j;

        /* renamed from: k, reason: collision with root package name */
        public CharSequence f4642k;

        /* renamed from: l, reason: collision with root package name */
        public DialogInterface.OnClickListener f4643l;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnCancelListener f4645n;

        /* renamed from: o, reason: collision with root package name */
        public DialogInterface.OnDismissListener f4646o;

        /* renamed from: p, reason: collision with root package name */
        public DialogInterface.OnKeyListener f4647p;

        /* renamed from: q, reason: collision with root package name */
        public CharSequence[] f4648q;

        /* renamed from: r, reason: collision with root package name */
        public ListAdapter f4649r;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnClickListener f4650s;

        /* renamed from: t, reason: collision with root package name */
        public View f4651t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f4652u;

        /* renamed from: v, reason: collision with root package name */
        public int f4653v = -1;

        /* renamed from: m, reason: collision with root package name */
        public boolean f4644m = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f4633a = contextThemeWrapper;
            this.f4634b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<DialogInterface> f4654a;

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f4654a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, DialogC0783j dialogC0783j, Window window) {
        this.f4605a = context;
        this.f4606b = dialogC0783j;
        this.f4607c = window;
        c cVar = new c();
        cVar.f4654a = new WeakReference<>(dialogC0783j);
        this.f4603K = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0756a.f20733e, R.attr.alertDialogStyle, 0);
        this.f4598F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f4599G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f4600H = obtainStyledAttributes.getResourceId(7, 0);
        this.f4601I = obtainStyledAttributes.getResourceId(3, 0);
        this.f4602J = obtainStyledAttributes.getBoolean(6, true);
        this.f4608d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogC0783j.f().u(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message obtainMessage = onClickListener != null ? this.f4603K.obtainMessage(i, onClickListener) : null;
        if (i == -3) {
            this.f4623t = charSequence;
            this.f4624u = obtainMessage;
            this.f4625v = null;
        } else if (i == -2) {
            this.f4619p = charSequence;
            this.f4620q = obtainMessage;
            this.f4621r = null;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4615l = charSequence;
            this.f4616m = obtainMessage;
            this.f4617n = null;
        }
    }
}
