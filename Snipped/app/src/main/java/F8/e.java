package F8;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import com.luminary.mobile.R;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ContextExt.kt */
/* loaded from: classes2.dex */
public final class e {
    public static void a(Fragment fragment, m8.e eVar, InterfaceC0635a interfaceC0635a, InterfaceC0635a interfaceC0635a2, InterfaceC0635a interfaceC0635a3) {
        B6.g gVar = new B6.g(1);
        Context requireContext = fragment.requireContext();
        int C10 = U4.b.C(30 * Resources.getSystem().getDisplayMetrics().density);
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.dialog_file_picker, new LinearLayout(requireContext));
        androidx.appcompat.app.b create = new E2.b(requireContext).setView(inflate).create();
        Window window = create.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), 0, 0, 0, C10));
        }
        Window window2 = create.getWindow();
        WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
        if (attributes != null) {
            attributes.gravity = 80;
        }
        Window window3 = create.getWindow();
        if (window3 != null) {
            window3.setAttributes(attributes);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.tv_files);
        View findViewById = inflate.findViewById(R.id.divider_1);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_gallery);
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_camera);
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_delete);
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_cancel);
        if (interfaceC0635a == null) {
            textView.setVisibility(8);
            findViewById.setVisibility(8);
        }
        if (eVar == null) {
            textView4.setVisibility(8);
            findViewById.setVisibility(8);
        }
        o.c(textView, 500L, new d(create, interfaceC0635a, 7));
        o.c(textView2, 500L, new d(create, interfaceC0635a2, 8));
        o.c(textView3, 500L, new d(create, interfaceC0635a3, 9));
        o.c(textView5, 500L, new d(create, gVar, 0));
        o.c(textView4, 500L, new d(create, eVar, 1));
        create.show();
    }

    public static final String b(Context context, Uri uri) {
        Cursor query = context.getContentResolver().query(uri, null, null, null, null);
        if (query != null) {
            Cursor cursor = query;
            try {
                Cursor cursor2 = cursor;
                int columnIndex = cursor2.getColumnIndex("_display_name");
                cursor2.moveToFirst();
                String string = cursor2.getString(columnIndex);
                U4.b.d(cursor, null);
                if (string != null) {
                    return string;
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    U4.b.d(cursor, th);
                    throw th2;
                }
            }
        }
        return "";
    }

    public static final String c(Context context, Uri uri) {
        if (uri != null) {
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                return Base64.encodeToString(openInputStream != null ? U4.b.w(openInputStream) : null, 0);
            } catch (IOException e10) {
                e10.printStackTrace();
            }
        }
        return null;
    }
}
