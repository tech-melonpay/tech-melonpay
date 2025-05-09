package T1;

import C.N;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.room.Room;
import com.chuckerteam.chucker.internal.data.room.ChuckerDatabase;
import h.ActivityC0775b;

/* compiled from: BaseChuckerActivity.kt */
/* loaded from: classes.dex */
public abstract class a extends ActivityC0775b {
    public static void l(a aVar, String str) {
        Toast.makeText(aVar.getApplicationContext(), str, 0).show();
    }

    @Override // androidx.fragment.app.ActivityC0533g, androidx.activity.ComponentActivity, j0.ActivityC0879h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        if (Ja.a.f2210a == null) {
            int i = ChuckerDatabase.f8621a;
            Ja.a.f2210a = new N((ChuckerDatabase) Room.databaseBuilder(applicationContext, ChuckerDatabase.class, "chucker.db").fallbackToDestructiveMigration().build(), 3);
        }
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0533g, android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
