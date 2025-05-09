package m;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1021x {

    /* renamed from: a, reason: collision with root package name */
    public TextView f23811a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f23812b;

    /* compiled from: AppCompatTextClassifierHelper.java */
    /* renamed from: m.x$a */
    public static final class a {
        public static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }
}
