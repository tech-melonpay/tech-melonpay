package m8;

import O9.p;
import android.content.Intent;
import android.os.Build;
import ca.InterfaceC0635a;
import com.luminary.business.presentation.ui.activity.main.MainActivity;
import com.luminary.business.presentation.ui.activity.passcode.PasscodeActivity;
import com.luminary.business.presentation.ui.fragments.settings.SettingsFragment;
import com.luminary.business.presentation.ui.fragments.settings.SettingsViewModel;
import com.luminary.business.presentation.utils.filepiker.FilePickerContractor;
import com.luminary.mobile.R;
import java.util.Iterator;
import v6.C1546a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements InterfaceC0635a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SettingsFragment f24022b;

    public /* synthetic */ e(SettingsFragment settingsFragment, int i) {
        this.f24021a = i;
        this.f24022b = settingsFragment;
    }

    @Override // ca.InterfaceC0635a
    public final Object invoke() {
        Object obj = null;
        int i = 1;
        int i9 = 0;
        SettingsFragment settingsFragment = this.f24022b;
        switch (this.f24021a) {
            case 0:
                SettingsViewModel T02 = settingsFragment.T0();
                int i10 = settingsFragment.f12984q0;
                T02.getClass();
                Z6.e eVar = new Z6.e(i10, T02);
                T02.N0 = eVar;
                eVar.invoke();
                break;
            case 1:
                settingsFragment.f12987u0.a(FilePickerContractor.FileTypeEnum.Image);
                break;
            case 2:
                if (Build.VERSION.SDK_INT < 29) {
                    settingsFragment.f12988v0.a("android.permission.WRITE_EXTERNAL_STORAGE");
                } else {
                    settingsFragment.f12990x0.a("android.permission.CAMERA");
                }
                break;
            case 3:
                ((MainActivity) settingsFragment.requireActivity()).E(true);
                break;
            case 4:
                settingsFragment.getClass();
                Intent intent = new Intent(settingsFragment.requireContext(), (Class<?>) PasscodeActivity.class);
                int i11 = PasscodeActivity.f11423y;
                intent.putExtra("IS_SETUP", false);
                intent.putExtra("DEACTIVATE_ACCOUNT", true);
                settingsFragment.f12989w0.a(intent);
                break;
            case 5:
                break;
            case 6:
                Iterator<T> it = settingsFragment.T0().j0().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (kotlin.jvm.internal.f.b(((C1546a) next).f30653a, settingsFragment.getString(R.string.face_id))) {
                            obj = next;
                        }
                    }
                }
                C1546a c1546a = (C1546a) obj;
                if (c1546a != null) {
                    c1546a.f30657e = Boolean.TRUE;
                }
                settingsFragment.V0();
                break;
            case 7:
                settingsFragment.T0().f428p.setValue(null);
                break;
            default:
                settingsFragment.getClass();
                F8.e.a(settingsFragment, new e(settingsFragment, i9), null, new e(settingsFragment, i), new e(settingsFragment, 2));
                break;
        }
        return p.f3034a;
    }
}
