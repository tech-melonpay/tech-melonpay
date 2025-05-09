package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class zzev {
    final /* synthetic */ zzfa zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzev(zzfa zzfaVar, String str, Bundle bundle) {
        this.zza = zzfaVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    public final Bundle zza() {
        char c2;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int hashCode = string3.hashCode();
                            if (hashCode == 100) {
                                if (string3.equals("d")) {
                                    c2 = 1;
                                }
                                c2 = 65535;
                            } else if (hashCode != 108) {
                                if (hashCode == 115 && string3.equals("s")) {
                                    c2 = 0;
                                }
                                c2 = 65535;
                            } else {
                                if (string3.equals("l")) {
                                    c2 = 2;
                                }
                                c2 = 65535;
                            }
                            if (c2 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (c2 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (c2 != 2) {
                                this.zza.zzs.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzs.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    androidx.camera.core.impl.utils.a.t(this.zza.zzs, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor edit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            edit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put("v", obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e10) {
                        this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.zzd = bundle;
    }
}
