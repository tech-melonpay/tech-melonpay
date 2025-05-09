package X2;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.luminary.mobile.R;

/* compiled from: PasswordToggleEndIconDelegate.java */
/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: e, reason: collision with root package name */
    public final int f4020e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f4021f;

    /* renamed from: g, reason: collision with root package name */
    public final J7.b f4022g;

    public o(com.google.android.material.textfield.a aVar, int i) {
        super(aVar);
        this.f4020e = R.drawable.design_password_eye;
        this.f4022g = new J7.b(this, 6);
        if (i != 0) {
            this.f4020e = i;
        }
    }

    @Override // X2.i
    public final void b() {
        q();
    }

    @Override // X2.i
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // X2.i
    public final int d() {
        return this.f4020e;
    }

    @Override // X2.i
    public final View.OnClickListener f() {
        return this.f4022g;
    }

    @Override // X2.i
    public final boolean k() {
        return true;
    }

    @Override // X2.i
    public final boolean l() {
        EditText editText = this.f4021f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // X2.i
    public final void m(EditText editText) {
        this.f4021f = editText;
        q();
    }

    @Override // X2.i
    public final void r() {
        EditText editText = this.f4021f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f4021f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // X2.i
    public final void s() {
        EditText editText = this.f4021f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
