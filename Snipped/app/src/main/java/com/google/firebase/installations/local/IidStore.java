package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sumsub.sns.internal.core.data.model.p;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.jmrtd.PassportService;
import org.json.JSONException;
import org.json.JSONObject;
import s3.b;

/* loaded from: classes.dex */
public class IidStore {
    private static final String[] ALLOWABLE_SCOPES = {"*", FirebaseMessaging.INSTANCE_ID_SCOPE, CodePackage.GCM, ""};
    private static final String IID_SHARED_PREFS_NAME = "com.google.android.gms.appid";
    private static final String JSON_ENCODED_PREFIX = "{";
    private static final String JSON_TOKEN_KEY = "token";
    private static final String STORE_KEY_ID = "|S|id";
    private static final String STORE_KEY_PUB = "|S||P|";
    private static final String STORE_KEY_SEPARATOR = "|";
    private static final String STORE_KEY_TOKEN = "|T|";
    private final String defaultSenderId;
    private final SharedPreferences iidPrefs;

    public IidStore(FirebaseApp firebaseApp) {
        this.iidPrefs = firebaseApp.getApplicationContext().getSharedPreferences(IID_SHARED_PREFS_NAME, 0);
        this.defaultSenderId = getDefaultSenderId(firebaseApp);
    }

    private String createTokenKey(String str, String str2) {
        return b.k(STORE_KEY_TOKEN, str, STORE_KEY_SEPARATOR, str2);
    }

    private static String getDefaultSenderId(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] split = applicationId.split(p.f15541a);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String getIdFromPublicKey(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & PassportService.SFI_DG15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String parseIidTokenFromJson(String str) {
        try {
            return new JSONObject(str).getString(JSON_TOKEN_KEY);
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey parseKey(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
            Log.w("ContentValues", "Invalid key stored " + e10);
            return null;
        }
    }

    private String readInstanceIdFromLocalStorage() {
        String string;
        synchronized (this.iidPrefs) {
            string = this.iidPrefs.getString(STORE_KEY_ID, null);
        }
        return string;
    }

    private String readPublicKeyFromLocalStorageAndCalculateInstanceId() {
        synchronized (this.iidPrefs) {
            try {
                String string = this.iidPrefs.getString(STORE_KEY_PUB, null);
                if (string == null) {
                    return null;
                }
                PublicKey parseKey = parseKey(string);
                if (parseKey == null) {
                    return null;
                }
                return getIdFromPublicKey(parseKey);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String readIid() {
        synchronized (this.iidPrefs) {
            try {
                String readInstanceIdFromLocalStorage = readInstanceIdFromLocalStorage();
                if (readInstanceIdFromLocalStorage != null) {
                    return readInstanceIdFromLocalStorage;
                }
                return readPublicKeyFromLocalStorageAndCalculateInstanceId();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String readToken() {
        synchronized (this.iidPrefs) {
            try {
                for (String str : ALLOWABLE_SCOPES) {
                    String string = this.iidPrefs.getString(createTokenKey(this.defaultSenderId, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith(JSON_ENCODED_PREFIX)) {
                            string = parseIidTokenFromJson(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public IidStore(SharedPreferences sharedPreferences, String str) {
        this.iidPrefs = sharedPreferences;
        this.defaultSenderId = str;
    }
}
