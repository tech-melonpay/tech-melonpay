package D8;

import android.content.Context;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.utils.bottomDialog.BottomDialogType;

/* compiled from: BottomDialogManager.kt */
/* loaded from: classes2.dex */
public interface a {

    /* compiled from: BottomDialogManager.kt */
    /* renamed from: D8.a$a, reason: collision with other inner class name */
    public static final class C0010a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void a(a aVar, BottomDialogType bottomDialogType, InterfaceC0635a interfaceC0635a, int i) {
            if ((i & 2) != 0) {
                interfaceC0635a = null;
            }
            aVar.c(bottomDialogType, interfaceC0635a, null);
        }
    }

    boolean a();

    void b(Context context);

    void c(BottomDialogType bottomDialogType, InterfaceC0635a<? extends Object> interfaceC0635a, InterfaceC0635a<? extends Object> interfaceC0635a2);

    void dismiss();
}
