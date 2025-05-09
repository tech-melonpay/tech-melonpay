package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlertController f4655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f4656b;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f4656b = bVar;
        this.f4655a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j10) {
        AlertController.b bVar = this.f4656b;
        DialogInterface.OnClickListener onClickListener = bVar.f4650s;
        AlertController alertController = this.f4655a;
        onClickListener.onClick(alertController.f4606b, i);
        if (bVar.f4652u) {
            return;
        }
        alertController.f4606b.dismiss();
    }
}
