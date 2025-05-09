package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import h.DialogC0783j;

/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public final class b extends DialogC0783j implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final AlertController f4657f;

    /* compiled from: AlertDialog.java */
    public static class a {

        /* renamed from: P, reason: collision with root package name */
        private final AlertController.b f4658P;
        private final int mTheme;

        public a(Context context) {
            this(context, b.i(context, 0));
        }

        public b create() {
            b bVar = new b(this.f4658P.f4633a, this.mTheme);
            AlertController.b bVar2 = this.f4658P;
            View view = bVar2.f4637e;
            AlertController alertController = bVar.f4657f;
            if (view != null) {
                alertController.f4595C = view;
            } else {
                CharSequence charSequence = bVar2.f4636d;
                if (charSequence != null) {
                    alertController.f4609e = charSequence;
                    TextView textView = alertController.f4593A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f4635c;
                if (drawable != null) {
                    alertController.f4628y = drawable;
                    alertController.f4627x = 0;
                    ImageView imageView = alertController.f4629z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f4629z.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = bVar2.f4638f;
            if (charSequence2 != null) {
                alertController.f4610f = charSequence2;
                TextView textView2 = alertController.f4594B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar2.f4639g;
            if (charSequence3 != null) {
                alertController.c(-1, charSequence3, bVar2.f4640h);
            }
            CharSequence charSequence4 = bVar2.i;
            if (charSequence4 != null) {
                alertController.c(-2, charSequence4, bVar2.f4641j);
            }
            CharSequence charSequence5 = bVar2.f4642k;
            if (charSequence5 != null) {
                alertController.c(-3, charSequence5, bVar2.f4643l);
            }
            if (bVar2.f4648q != null || bVar2.f4649r != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f4634b.inflate(alertController.f4599G, (ViewGroup) null);
                int i = bVar2.f4652u ? alertController.f4600H : alertController.f4601I;
                ListAdapter listAdapter = bVar2.f4649r;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f4633a, i, R.id.text1, bVar2.f4648q);
                }
                alertController.f4596D = listAdapter;
                alertController.f4597E = bVar2.f4653v;
                if (bVar2.f4650s != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar2, alertController));
                }
                if (bVar2.f4652u) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f4611g = recycleListView;
            }
            View view2 = bVar2.f4651t;
            if (view2 != null) {
                alertController.f4612h = view2;
                alertController.i = 0;
                alertController.f4613j = false;
            }
            bVar.setCancelable(this.f4658P.f4644m);
            if (this.f4658P.f4644m) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f4658P.f4645n);
            bVar.setOnDismissListener(this.f4658P.f4646o);
            DialogInterface.OnKeyListener onKeyListener = this.f4658P.f4647p;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context getContext() {
            return this.f4658P.f4633a;
        }

        public a setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.f4649r = listAdapter;
            bVar.f4650s = onClickListener;
            return this;
        }

        public a setCancelable(boolean z10) {
            this.f4658P.f4644m = z10;
            return this;
        }

        public a setCustomTitle(View view) {
            this.f4658P.f4637e = view;
            return this;
        }

        public a setIcon(Drawable drawable) {
            this.f4658P.f4635c = drawable;
            return this;
        }

        public a setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.f4648q = charSequenceArr;
            bVar.f4650s = onClickListener;
            return this;
        }

        public a setMessage(CharSequence charSequence) {
            this.f4658P.f4638f = charSequence;
            return this;
        }

        public a setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.i = charSequence;
            bVar.f4641j = onClickListener;
            return this;
        }

        public a setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.f4642k = charSequence;
            bVar.f4643l = onClickListener;
            return this;
        }

        public a setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f4658P.f4645n = onCancelListener;
            return this;
        }

        public a setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f4658P.f4646o = onDismissListener;
            return this;
        }

        public a setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f4658P.f4647p = onKeyListener;
            return this;
        }

        public a setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.f4639g = charSequence;
            bVar.f4640h = onClickListener;
            return this;
        }

        public a setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f4658P;
            bVar.f4649r = listAdapter;
            bVar.f4650s = onClickListener;
            bVar.f4653v = i;
            bVar.f4652u = true;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f4658P.f4636d = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f4658P.f4651t = view;
            return this;
        }

        public b show() {
            b create = create();
            create.show();
            return create;
        }

        public a(Context context, int i) {
            this.f4658P = new AlertController.b(new ContextThemeWrapper(context, b.i(context, i)));
            this.mTheme = i;
        }
    }

    public b(Context context, int i) {
        super(context, i(context, i));
        this.f4657f = new AlertController(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(com.luminary.mobile.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0321  */
    @Override // h.DialogC0783j, c.DialogC0616g, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4657f.f4626w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4657f.f4626w;
        if (nestedScrollView == null || !nestedScrollView.d(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.DialogC0783j, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f4657f;
        alertController.f4609e = charSequence;
        TextView textView = alertController.f4593A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
