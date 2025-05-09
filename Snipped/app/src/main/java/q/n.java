package q;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d;
import androidx.lifecycle.C0559z;
import com.luminary.mobile.R;
import q.i;

/* compiled from: FingerprintDialogFragment.java */
/* loaded from: classes.dex */
public final class n extends DialogInterfaceOnCancelListenerC0530d {

    /* renamed from: f0, reason: collision with root package name */
    public final Handler f25817f0 = new Handler(Looper.getMainLooper());

    /* renamed from: g0, reason: collision with root package name */
    public final a f25818g0 = new a();

    /* renamed from: h0, reason: collision with root package name */
    public k f25819h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f25820i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f25821j0;

    /* renamed from: k0, reason: collision with root package name */
    public ImageView f25822k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f25823l0;

    /* compiled from: FingerprintDialogFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n nVar = n.this;
            Context context = nVar.getContext();
            if (context == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
            } else {
                nVar.f25819h0.o(1);
                nVar.f25819h0.n(context.getString(R.string.fingerprint_dialog_touch_sensor));
            }
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            n.this.f25819h0.p(true);
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public static class c {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* compiled from: FingerprintDialogFragment.java */
    public static class d {
        public static int a() {
            return R.attr.colorError;
        }
    }

    public final int c(int i) {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        k kVar = this.f25819h0;
        if (kVar.f25805U0 == null) {
            kVar.f25805U0 = new C0559z<>();
        }
        k.q(kVar.f25805U0, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k b9 = i.b(this, getArguments().getBoolean("host_activity", true));
        this.f25819h0 = b9;
        if (b9.f25807W0 == null) {
            b9.f25807W0 = new C0559z<>();
        }
        b9.f25807W0.observe(this, new o(this, 0));
        k kVar = this.f25819h0;
        if (kVar.f25808X0 == null) {
            kVar.f25808X0 = new C0559z<>();
        }
        kVar.f25808X0.observe(this, new o(this, 1));
        this.f25820i0 = c(d.a());
        this.f25821j0 = c(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0530d
    public final Dialog onCreateDialog(Bundle bundle) {
        b.a aVar = new b.a(requireContext());
        i.d dVar = this.f25819h0.f25787B0;
        aVar.setTitle(dVar != null ? dVar.f25780a : null);
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            i.d dVar2 = this.f25819h0.f25787B0;
            CharSequence charSequence = dVar2 != null ? dVar2.f25781b : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.f25819h0.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f25822k0 = (ImageView) inflate.findViewById(R.id.fingerprint_icon);
        this.f25823l0 = (TextView) inflate.findViewById(R.id.fingerprint_error);
        aVar.setNegativeButton(C1127c.a(this.f25819h0.k()) ? getString(R.string.confirm_device_credential_password) : this.f25819h0.l(), new b());
        aVar.setView(inflate);
        androidx.appcompat.app.b create = aVar.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f25817f0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        k kVar = this.f25819h0;
        kVar.f25806V0 = 0;
        kVar.o(1);
        this.f25819h0.n(getString(R.string.fingerprint_dialog_touch_sensor));
    }
}
