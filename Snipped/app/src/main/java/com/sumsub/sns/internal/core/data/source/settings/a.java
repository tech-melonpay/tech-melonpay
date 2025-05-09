package com.sumsub.sns.internal.core.data.source.settings;

import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f16313a;

    public a(SharedPreferences sharedPreferences) {
        this.f16313a = sharedPreferences;
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public String a() {
        String string = this.f16313a.getString("applicant_id", "");
        return string == null ? "" : string;
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public String b() {
        String string = this.f16313a.getString("applicant_action_id", "");
        return string == null ? "" : string;
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void c(String str) {
        SharedPreferences.Editor edit = this.f16313a.edit();
        if (str == null) {
            edit.remove("applicant_id");
        }
        if (str != null) {
            edit.putString("applicant_id", str);
        }
        edit.commit();
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void d(String str) {
        SharedPreferences.Editor edit = this.f16313a.edit();
        edit.putString("key_external_id", str);
        edit.commit();
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public String f() {
        String string = this.f16313a.getString("device_id", null);
        if (string == null || string.length() == 0) {
            string = UUID.randomUUID().toString();
        }
        SharedPreferences.Editor edit = this.f16313a.edit();
        edit.putString("device_id", string);
        edit.commit();
        return string;
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public UUID g() {
        try {
            return UUID.fromString(this.f16313a.getString("key_session_id", ""));
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public String h() {
        return this.f16313a.getString("key_network_type", "");
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public boolean i() {
        return this.f16313a.getBoolean("dont_show_settings_dialog", false);
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void a(String str) {
        SharedPreferences.Editor edit = this.f16313a.edit();
        if (str == null) {
            edit.remove("applicant_action_id");
        }
        if (str != null) {
            edit.putString("applicant_action_id", str);
        }
        edit.commit();
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void b(String str) {
        SharedPreferences.Editor edit = this.f16313a.edit();
        edit.putString("key_network_type", str);
        edit.commit();
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void d() {
        SharedPreferences.Editor edit = this.f16313a.edit();
        edit.putBoolean("dont_show_settings_dialog", true);
        edit.commit();
    }

    @Override // com.sumsub.sns.internal.core.data.source.settings.b
    public void a(UUID uuid) {
        SharedPreferences.Editor edit = this.f16313a.edit();
        edit.putString("key_session_id", uuid.toString());
        edit.commit();
    }
}
