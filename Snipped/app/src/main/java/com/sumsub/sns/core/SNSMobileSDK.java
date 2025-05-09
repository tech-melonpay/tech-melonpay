package com.sumsub.sns.core;

import C.v;
import O9.p;
import P9.n;
import P9.s;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.camera.core.CameraInfo;
import androidx.fragment.app.Fragment;
import ca.InterfaceC0635a;
import ca.InterfaceC0646l;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.security.ProviderInstaller;
import com.sumsub.log.logger.Logger;
import com.sumsub.sentry.c0;
import com.sumsub.sentry.t;
import com.sumsub.sns.R$style;
import com.sumsub.sns.core.data.listener.SNSActionResultHandler;
import com.sumsub.sns.core.data.listener.SNSCompleteHandler;
import com.sumsub.sns.core.data.listener.SNSCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultCountryPicker;
import com.sumsub.sns.core.data.listener.SNSDefaultIconHandler;
import com.sumsub.sns.core.data.listener.SNSErrorHandler;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.listener.SNSInstructionsViewHandler;
import com.sumsub.sns.core.data.listener.SNSStateChangedHandler;
import com.sumsub.sns.core.data.listener.SNSUrlHandler;
import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.core.data.model.SNSDocumentDefinition;
import com.sumsub.sns.core.data.model.SNSException;
import com.sumsub.sns.core.data.model.SNSInitConfig;
import com.sumsub.sns.core.data.model.SNSInvalidParametersException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.core.theme.SNSJsonCustomization;
import com.sumsub.sns.core.theme.SNSJsonCustomizationImpl;
import com.sumsub.sns.internal.core.analytics.Screen;
import com.sumsub.sns.internal.core.analytics.b;
import com.sumsub.sns.internal.core.common.SNSSession;
import com.sumsub.sns.internal.core.common.e0;
import com.sumsub.sns.internal.core.common.g0;
import com.sumsub.sns.internal.core.common.i;
import com.sumsub.sns.internal.core.common.q0;
import com.sumsub.sns.internal.core.common.u0;
import com.sumsub.sns.internal.core.data.model.LogParams;
import com.sumsub.sns.internal.log.LoggerType;
import com.sumsub.sns.internal.log.logger.d;
import com.sumsub.sns.presentation.utils.a;
import com.sumsub.sns.prooface.SNSProoface;
import com.sumsub.sns.videoident.presentation.SNSVideoIdentFragment;
import com.sumsub.sns.videoident.service.SNSVideoChatService;
import j3.e;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import ka.C0969n;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;

@Keep
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004xyz{B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u00105\u001a\u0004\u0018\u0001028\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u0004\u0018\u00010:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010A\u001a\u00020>8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0016\u0010E\u001a\u0004\u0018\u00010B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020H8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010\rR\"\u0010R\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020O\u0018\u00010N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\"\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010QR\u0014\u0010X\u001a\u00020U8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0016\u0010\\\u001a\u0004\u0018\u00010Y8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010[R$\u0010c\u001a\n\u0012\u0004\u0012\u00020^\u0018\u00010]8\u0016@\u0016X\u0096\u000f¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0016\u0010g\u001a\u0004\u0018\u00010d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\be\u0010fR\u0016\u0010k\u001a\u0004\u0018\u00010h8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010\rR\u0014\u0010o\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bn\u0010\"R\u0014\u0010q\u001a\u00020\u00048\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bp\u0010\rR\u0013\u0010u\u001a\u0004\u0018\u00010r8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00060]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010`¨\u0006|"}, d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK;", "Lcom/sumsub/sns/core/MobileSdk;", "<init>", "()V", "", "className", "Lcom/sumsub/sns/core/SNSModule;", "getPluggedModule", "(Ljava/lang/String;)Lcom/sumsub/sns/core/SNSModule;", "", "isModuleAvailable", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "LO9/p;", "shutdown", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "sdk", "start", "(Lcom/sumsub/sns/core/SNSMobileSDK$SDK;)V", "initLogger", "initFeatures", "_sdk", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "Lcom/sumsub/log/logger/Logger;", "<set-?>", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree", "()Lcom/sumsub/log/logger/Logger;", "", "theme", "I", "getTheme", "()I", "Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "getActionResultHandler", "()Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "actionResultHandler", "getAutoCloseOnApproveTimeout", "()Ljava/lang/Integer;", "autoCloseOnApproveTimeout", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "getCountryPicker", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "countryPicker", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customization", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "eventHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsViewHandler", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "instructionsViewHandler", "isDebug", "()Z", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "getPackageName", "packageName", "", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "getPreferredDocumentsDefinitions", "()Ljava/util/Map;", "preferredDocumentsDefinitions", "getSettings", "settings", "Lcom/sumsub/sns/core/data/model/SNSSDKState;", "getState", "()Lcom/sumsub/sns/core/data/model/SNSSDKState;", "state", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "stateChangedHandler", "", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "getSupportItems", "()Ljava/util/List;", "setSupportItems", "(Ljava/util/List;)V", "supportItems", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getTokenExpirationHandler", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "tokenExpirationHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getUrlHandler", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "urlHandler", "getVersion", "version", "getVersionCode", "versionCode", "getVersionName", "versionName", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "completeHandler", "getModules", "modules", "Builder", "SDK", "SNSExceptionHandler", "SNSSDK", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SNSMobileSDK implements MobileSdk {
    public static final SNSMobileSDK INSTANCE = new SNSMobileSDK();
    private static SDK _sdk;
    private static Logger logTree;
    private static int theme;
    private final /* synthetic */ e0 $$delegate_0 = e0.f15081a;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$SNSExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Landroid/content/Context;", "context", "Lcom/sumsub/sns/internal/log/cacher/c;", "Lcom/sumsub/sns/internal/core/data/model/LogParams;", "sink", "previousHandler", "<init>", "(Landroid/content/Context;Lcom/sumsub/sns/internal/log/cacher/c;Ljava/lang/Thread$UncaughtExceptionHandler;)V", "", "e", "prepareLogParams", "(Ljava/lang/Throwable;)Lcom/sumsub/sns/internal/core/data/model/LogParams;", "ex", "", "isSumSubException", "(Ljava/lang/Throwable;)Z", "Ljava/lang/Thread;", "t", "LO9/p;", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "Lcom/sumsub/sns/internal/log/cacher/c;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class SNSExceptionHandler implements Thread.UncaughtExceptionHandler {
        private final Context context;
        private final Thread.UncaughtExceptionHandler previousHandler;
        private final com.sumsub.sns.internal.log.cacher.c<LogParams> sink;

        public SNSExceptionHandler(Context context, com.sumsub.sns.internal.log.cacher.c<LogParams> cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.context = context;
            this.sink = cVar;
            this.previousHandler = uncaughtExceptionHandler;
        }

        private final boolean isSumSubException(Throwable ex) {
            boolean z10 = false;
            if (ex == null) {
                return false;
            }
            StackTraceElement[] stackTrace = ex.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (stackTrace[i].getClassName().startsWith("com.sumsub")) {
                    z10 = true;
                    break;
                }
                i++;
            }
            return !z10 ? isSumSubException(ex.getCause()) : z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LogParams prepareLogParams(Throwable e10) {
            if (!isSumSubException(e10)) {
                return null;
            }
            StackTraceElement[] stackTrace = e10.getStackTrace();
            String string = this.context.getSharedPreferences("idensic_mobile_sdk", 0).getString("applicant_id", "");
            String str = string == null ? "" : string;
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            String valueOf = String.valueOf(stackTrace[0].getLineNumber());
            String fileName = stackTrace[0].getFileName();
            String str2 = fileName + ':' + valueOf;
            String message = e10.getMessage();
            return new LogParams("uncaughtException", str2, (String) null, fileName, str, message == null ? "" : message, (String) null, stringWriter.toString(), 64, (DefaultConstructorMarker) null);
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread t3, Throwable e10) {
            try {
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SNSMobileSDK$SNSExceptionHandler$uncaughtException$1(this, e10, null), 3, null);
            } catch (Exception unused) {
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(t3, e10);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$SNSSDK;", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "builder", "<init>", "(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V", "LO9/p;", "launch", "()V", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class SNSSDK extends SDK {
        private final SNSStateChangedHandler stateChangedHandler;

        public SNSSDK(Builder builder) {
            super(builder);
            this.stateChangedHandler = builder.getStateChangedHandler();
        }

        /* renamed from: getStateChangedHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        @Override // com.sumsub.sns.core.SNSMobileSDK.SDK
        public void launch() {
            installUncaughtExceptionHandler$idensic_mobile_sdk_aar_release(getUrl());
            super.launch();
            SNSMobileSDK.INSTANCE.start(this);
        }
    }

    static {
        SNSJsonCustomization.INSTANCE.setDefaultJsonCustomizationProvider(new InterfaceC0635a<SNSJsonCustomizationImpl>() { // from class: com.sumsub.sns.core.SNSMobileSDK.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSJsonCustomizationImpl invoke() {
                return new SNSJsonCustomizationImpl();
            }
        });
        e0 e0Var = e0.f15081a;
        e0Var.a(new InterfaceC0635a<SNSInitConfig>() { // from class: com.sumsub.sns.core.SNSMobileSDK.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSInitConfig invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getConf();
                }
                return null;
            }
        }, new InterfaceC0635a<Map<String, ? extends String>>() { // from class: com.sumsub.sns.core.SNSMobileSDK.3
            @Override // ca.InterfaceC0635a
            public final Map<String, ? extends String> invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getSettings$idensic_mobile_sdk_aar_release();
                }
                return null;
            }
        }, new InterfaceC0635a<TokenExpirationHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final TokenExpirationHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getOnTokenExpiration();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSStateChangedHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSStateChangedHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                SNSSDK snssdk = sdk instanceof SNSSDK ? (SNSSDK) sdk : null;
                if (snssdk != null) {
                    return snssdk.getStateChangedHandler();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSErrorHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSErrorHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getErrorHandler();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSEventHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSEventHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getEventHandler();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSJsonCustomization>() { // from class: com.sumsub.sns.core.SNSMobileSDK.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSJsonCustomization invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getCustomization();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSInstructionsViewHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSInstructionsViewHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getInstructionsViewHandler();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSActionResultHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSActionResultHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getActionResultHandler();
                }
                return null;
            }
        }, new InterfaceC0646l<String, SNSModule>() { // from class: com.sumsub.sns.core.SNSMobileSDK.11
            @Override // ca.InterfaceC0646l
            public final SNSModule invoke(String str) {
                Object obj;
                List modules = SNSMobileSDK.INSTANCE.getModules();
                ListIterator listIterator = modules.listIterator(modules.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (f.b(((SNSModule) obj).getClass().getName(), str)) {
                        break;
                    }
                }
                return (SNSModule) obj;
            }
        }, new InterfaceC0635a<SNSIconHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSIconHandler invoke() {
                SNSIconHandler iconHandler;
                SDK sdk = SNSMobileSDK._sdk;
                return (sdk == null || (iconHandler = sdk.getIconHandler()) == null) ? new SNSDefaultIconHandler() : iconHandler;
            }
        }, new InterfaceC0635a<SNSCountryPicker>() { // from class: com.sumsub.sns.core.SNSMobileSDK.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSCountryPicker invoke() {
                SNSCountryPicker countryPicker;
                SDK sdk = SNSMobileSDK._sdk;
                return (sdk == null || (countryPicker = sdk.getCountryPicker()) == null) ? new SNSDefaultCountryPicker() : countryPicker;
            }
        }, new InterfaceC0635a<Map<String, ? extends SNSDocumentDefinition>>() { // from class: com.sumsub.sns.core.SNSMobileSDK.14
            @Override // ca.InterfaceC0635a
            public final Map<String, ? extends SNSDocumentDefinition> invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release();
                }
                return null;
            }
        }, new InterfaceC0635a<Integer>() { // from class: com.sumsub.sns.core.SNSMobileSDK.15
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final Integer invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getAutoCloseOnApproveTimeout();
                }
                return null;
            }
        }, new InterfaceC0635a<SNSUrlHandler>() { // from class: com.sumsub.sns.core.SNSMobileSDK.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // ca.InterfaceC0635a
            public final SNSUrlHandler invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getSnsUrlHandler();
                }
                return null;
            }
        });
        e0Var.a(new InterfaceC0635a<List<? extends SNSSupportItem>>() { // from class: com.sumsub.sns.core.SNSMobileSDK.17
            @Override // ca.InterfaceC0635a
            public final List<? extends SNSSupportItem> invoke() {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk != null) {
                    return sdk.getSupportItems$idensic_mobile_sdk_aar_release();
                }
                return null;
            }
        }, new InterfaceC0646l<List<? extends SNSSupportItem>, p>() { // from class: com.sumsub.sns.core.SNSMobileSDK.18
            @Override // ca.InterfaceC0646l
            public /* bridge */ /* synthetic */ p invoke(List<? extends SNSSupportItem> list) {
                invoke2((List<SNSSupportItem>) list);
                return p.f3034a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<SNSSupportItem> list) {
                SDK sdk = SNSMobileSDK._sdk;
                if (sdk == null) {
                    return;
                }
                sdk.setSupportItems$idensic_mobile_sdk_aar_release(list);
            }
        });
        com.sumsub.sns.core.presentation.c cVar = com.sumsub.sns.core.presentation.c.f14171a;
        cVar.a(new InterfaceC0646l<Fragment, Screen>() { // from class: com.sumsub.sns.core.SNSMobileSDK.19
            @Override // ca.InterfaceC0646l
            public final Screen invoke(Fragment fragment) {
                return a.a(fragment);
            }
        });
        if (b.f14967a.h() && u0.b()) {
            cVar.a(new InterfaceC0646l<Fragment, Screen>() { // from class: com.sumsub.sns.core.SNSMobileSDK.20
                @Override // ca.InterfaceC0646l
                public final Screen invoke(Fragment fragment) {
                    Screen screen = Screen.VideoidentScreen;
                    if (fragment instanceof SNSVideoIdentFragment) {
                        return screen;
                    }
                    return null;
                }
            });
        }
        logTree = d.f17576a;
        theme = R$style.Theme_SNSCore;
    }

    private SNSMobileSDK() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<SNSModule> getModules() {
        List<SNSModule> modules$idensic_mobile_sdk_aar_release;
        SDK sdk = _sdk;
        return (sdk == null || (modules$idensic_mobile_sdk_aar_release = sdk.getModules$idensic_mobile_sdk_aar_release()) == null) ? EmptyList.f23104a : modules$idensic_mobile_sdk_aar_release;
    }

    private final void initFeatures(SDK sdk) {
        com.sumsub.sns.internal.ff.a.f16930a.F();
        c cVar = c.f14016a;
        StringBuilder sb2 = new StringBuilder("initFeatures: ");
        List<SNSModule> modules$idensic_mobile_sdk_aar_release = sdk.getModules$idensic_mobile_sdk_aar_release();
        ArrayList arrayList = new ArrayList(n.u(modules$idensic_mobile_sdk_aar_release, 10));
        Iterator<T> it = modules$idensic_mobile_sdk_aar_release.iterator();
        while (it.hasNext()) {
            arrayList.add(((SNSModule) it.next()).getName());
        }
        sb2.append(arrayList);
        c.b(cVar, "SDK", sb2.toString(), null, 4, null);
        for (SNSModule sNSModule : sdk.getModules$idensic_mobile_sdk_aar_release()) {
            if (sNSModule instanceof SNSProoface) {
                com.sumsub.sns.internal.ff.a aVar = com.sumsub.sns.internal.ff.a.f16930a;
                SNSProoface sNSProoface = (SNSProoface) sNSModule;
                com.sumsub.sns.internal.ff.core.a.a(aVar.o(), sNSProoface.isDebug(), null, 2, null);
                com.sumsub.sns.internal.ff.core.a.a(aVar.p(), sNSProoface.isShowSettingsDialog(), null, 2, null);
            }
            if (sNSModule instanceof SNSCoreModule) {
                com.sumsub.sns.internal.ff.a aVar2 = com.sumsub.sns.internal.ff.a.f16930a;
                SNSCoreModule sNSCoreModule = (SNSCoreModule) sNSModule;
                com.sumsub.sns.internal.ff.core.a.a(aVar2.n(), sNSCoreModule.isFullScreenCamera(), null, 2, null);
                com.sumsub.sns.internal.ff.core.a.a(aVar2.x(), sNSCoreModule.isSkipGeolocationForm(), null, 2, null);
            }
        }
    }

    private final void initLogger(SDK sdk) {
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        aVar.a(sdk.getIsDebug());
        aVar.f();
        if (sdk.getIsDebug()) {
            if (sdk.getLogTree() instanceof d) {
                aVar.a(LoggerType.LOG_CAT, sdk.getLogTree(), true);
            } else {
                aVar.a(LoggerType.LOG_CAT, d.f17576a, true);
                aVar.a(LoggerType.SDK_CLIENT, sdk.getLogTree(), true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start(SDK sdk) {
        SNSErrorHandler errorHandler;
        SNSJsonCustomization customization;
        Activity activity = sdk.getWeakActivity$idensic_mobile_sdk_aar_release().get();
        if (activity == null) {
            return;
        }
        initFeatures(sdk);
        initLogger(sdk);
        t.f13782a.a(activity.getApplicationContext());
        _sdk = sdk;
        e0.f15081a.a(sdk.getIsDebug(), sdk.getLocale());
        logTree = sdk.getLogTree();
        Integer theme2 = sdk.getTheme();
        theme = theme2 != null ? theme2.intValue() : theme;
        try {
            SDK sdk2 = _sdk;
            if (sdk2 != null && (customization = sdk2.getCustomization()) != null) {
                customization.loadResources(activity.getApplicationContext());
            }
            b.f14967a.a(sdk.getIsAnalyticsEnabled());
            c.b(c.f14016a, "SDK", "starting: debug=" + sdk.getIsDebug() + " locale=" + sdk.getLocale() + " analytics=" + sdk.getIsAnalyticsEnabled(), null, 4, null);
            Intent intent = new Intent();
            intent.setClassName(getPackageName(), "com.sumsub.sns.presentation.screen.SNSAppActivity");
            String url = sdk.getUrl();
            String accessToken = sdk.getAccessToken();
            if (accessToken == null) {
                accessToken = "";
            }
            intent.putExtra(SNSVideoChatService.SNS_EXTRA_SESSION, new SNSSession(null, url, accessToken, getLocale(), isDebug(), getPackageName(), getVersionName(), getVersionCode(), sdk.getTheme(), 1, null));
            activity.startActivity(intent);
        } catch (Exception e10) {
            c.f14016a.a("SDK", "start error!!!", e10);
            SDK sdk3 = _sdk;
            if (sdk3 != null && (errorHandler = sdk3.getErrorHandler()) != null) {
                errorHandler.onError(new SNSException.Unknown(e10));
            }
        }
        com.sumsub.sns.internal.log.cacher.d.f17543a.b();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSActionResultHandler getActionResultHandler() {
        return this.$$delegate_0.getActionResultHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Integer getAutoCloseOnApproveTimeout() {
        return this.$$delegate_0.getAutoCloseOnApproveTimeout();
    }

    public final SNSCompleteHandler getCompleteHandler() {
        SDK sdk = _sdk;
        if (sdk != null) {
            return sdk.getCompleteHandler();
        }
        return null;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSInitConfig getConf() {
        return this.$$delegate_0.getConf();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSCountryPicker getCountryPicker() {
        return this.$$delegate_0.getCountryPicker();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSJsonCustomization getCustomization() {
        return this.$$delegate_0.getCustomization();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSErrorHandler getErrorHandler() {
        return this.$$delegate_0.getErrorHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSEventHandler getEventHandler() {
        return this.$$delegate_0.getEventHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSIconHandler getIconHandler() {
        return this.$$delegate_0.getIconHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSInstructionsViewHandler getInstructionsViewHandler() {
        return this.$$delegate_0.getInstructionsViewHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Locale getLocale() {
        return this.$$delegate_0.getLocale();
    }

    public final Logger getLogTree() {
        return logTree;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getPackageName() {
        return this.$$delegate_0.getPackageName();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSModule getPluggedModule(String className) {
        return this.$$delegate_0.getPluggedModule(className);
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions() {
        return this.$$delegate_0.getPreferredDocumentsDefinitions();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public Map<String, String> getSettings() {
        return this.$$delegate_0.getSettings();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSSDKState getState() {
        return this.$$delegate_0.getState();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSStateChangedHandler getStateChangedHandler() {
        return this.$$delegate_0.getStateChangedHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public List<SNSSupportItem> getSupportItems() {
        return this.$$delegate_0.getSupportItems();
    }

    public final int getTheme() {
        return theme;
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public TokenExpirationHandler getTokenExpirationHandler() {
        return this.$$delegate_0.getTokenExpirationHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public SNSUrlHandler getUrlHandler() {
        return this.$$delegate_0.getUrlHandler();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getVersion() {
        return this.$$delegate_0.getVersion();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public int getVersionCode() {
        return this.$$delegate_0.getVersionCode();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public String getVersionName() {
        return this.$$delegate_0.getVersionName();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isDebug() {
        return this.$$delegate_0.isDebug();
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public boolean isModuleAvailable(String className) {
        return this.$$delegate_0.isModuleAvailable(className);
    }

    @Override // com.sumsub.sns.core.MobileSdk
    public void setSupportItems(List<SNSSupportItem> list) {
        this.$$delegate_0.setSupportItems(list);
    }

    public final void shutdown() {
        c.b(c.f14016a, "SDK", "shutdown", null, 4, null);
        com.sumsub.sns.internal.log.a aVar = com.sumsub.sns.internal.log.a.f17535a;
        aVar.flush();
        aVar.d();
        b.f14967a.j();
        com.sumsub.sns.internal.log.cacher.d.f17543a.c();
        SDK sdk = _sdk;
        if (sdk != null) {
            sdk.removeUncaughtExceptionHandler$idensic_mobile_sdk_aar_release();
        }
        _sdk = null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SNSMobileSDK: Api Url: ");
        SDK sdk = _sdk;
        sb2.append(sdk != null ? sdk.getUrl() : null);
        sb2.append(", Access Token: ");
        SDK sdk2 = _sdk;
        sb2.append(sdk2 != null ? sdk2.getAccessToken() : null);
        sb2.append(",Modules: ");
        sb2.append(getModules().isEmpty() ? "Empty" : v.q(new StringBuilder("["), s.P(getModules(), null, null, null, new InterfaceC0646l<SNSModule, CharSequence>() { // from class: com.sumsub.sns.core.SNSMobileSDK$toString$1
            @Override // ca.InterfaceC0646l
            public final CharSequence invoke(SNSModule sNSModule) {
                return sNSModule.getName();
            }
        }, 31), ']'));
        sb2.append(", isDebug: ");
        sb2.append(isDebug());
        return sb2.toString();
    }

    @Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R(\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\"\u0010!R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%R(\u0010'\u001a\u0004\u0018\u00010&2\b\u0010\u001e\u001a\u0004\u0018\u00010&8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b,\u0010-R(\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u001e\u001a\u0004\u0018\u00010.8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R(\u00104\u001a\u0004\u0018\u0001032\b\u0010\u001e\u001a\u0004\u0018\u0001038\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R(\u00109\u001a\u0004\u0018\u0001082\b\u0010\u001e\u001a\u0004\u0018\u0001088\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR$\u0010E\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010L\u001a\u0004\u0018\u00010K2\b\u0010\u001e\u001a\u0004\u0018\u00010K8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR$\u0010Q\u001a\u00020P2\u0006\u0010\u001e\u001a\u00020P8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR$\u0010V\u001a\u0004\u0018\u00010U8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R0\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR4\u0010c\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010\\2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020b\u0018\u00010\\8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u0010_\u001a\u0004\bd\u0010aR$\u0010e\u001a\u00020P2\u0006\u0010\u001e\u001a\u00020P8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\be\u0010R\u001a\u0004\bf\u0010TR$\u0010h\u001a\u00020g2\u0006\u0010\u001e\u001a\u00020g8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00128\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0013\u0010l\u001a\u0004\bm\u0010nR(\u0010p\u001a\u0004\u0018\u00010o2\b\u0010\u001e\u001a\u0004\u0018\u00010o8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR$\u0010u\u001a\u0004\u0018\u00010t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR2\u0010|\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R6\u0010\u0083\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010{8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0083\u0001\u0010}\u001a\u0005\b\u0084\u0001\u0010\u007f\"\u0006\b\u0085\u0001\u0010\u0081\u0001R)\u0010\u0086\u0001\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0086\u0001\u0010q\u001a\u0005\b\u0087\u0001\u0010s\"\u0006\b\u0088\u0001\u0010\u0089\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "", "Landroid/app/Activity;", "activity", "", ImagesContract.URL, "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "(Landroid/app/Activity;)V", "accessToken", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "onTokenExpiration", "withAccessToken", "(Ljava/lang/String;Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "completeHandler", "withCompleteHandler", "(Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Ljava/util/Locale;", "locale", "withLocale", "(Ljava/util/Locale;)Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "build", "()Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "Ljava/lang/ref/WeakReference;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getWeakActivity$idensic_mobile_sdk_aar_release", "()Ljava/lang/ref/WeakReference;", "<set-?>", "Ljava/lang/String;", "getUrl$idensic_mobile_sdk_aar_release", "()Ljava/lang/String;", "getAccessToken$idensic_mobile_sdk_aar_release", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "stateChangedHandler", "Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "getStateChangedHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSStateChangedHandler;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "actionResultHandler", "Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "getActionResultHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "eventHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "instructionsHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "setInstructionsHandler$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;)V", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "countryPicker", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "getCountryPicker$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "setCountryPicker$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;)V", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "", "isAnalyticsEnabled", "Z", "isAnalyticsEnabled$idensic_mobile_sdk_aar_release", "()Z", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "setIconHandler$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/data/listener/SNSIconHandler;)V", "", "Lcom/sumsub/sns/core/SNSModule;", "modules", "Ljava/util/List;", "getModules$idensic_mobile_sdk_aar_release", "()Ljava/util/List;", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "supportItems", "getSupportItems$idensic_mobile_sdk_aar_release", "isDebug", "isDebug$idensic_mobile_sdk_aar_release", "Lcom/sumsub/log/logger/Logger;", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/log/logger/Logger;", "Ljava/util/Locale;", "getLocale$idensic_mobile_sdk_aar_release", "()Ljava/util/Locale;", "", "theme", "Ljava/lang/Integer;", "getTheme$idensic_mobile_sdk_aar_release", "()Ljava/lang/Integer;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customization", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "setCustomization$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/theme/SNSJsonCustomization;)V", "", "settings", "Ljava/util/Map;", "getSettings$idensic_mobile_sdk_aar_release", "()Ljava/util/Map;", "setSettings$idensic_mobile_sdk_aar_release", "(Ljava/util/Map;)V", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "preferredDocumentsDefinitions", "getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release", "setPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_release", "setAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_release", "(Ljava/lang/Integer;)V", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "urlHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getUrlHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "setUrlHandler$idensic_mobile_sdk_aar_release", "(Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {
        private String accessToken;
        private SNSActionResultHandler actionResultHandler;
        private Integer autoCloseOnApproveTimeout;
        private SNSCompleteHandler completeHandler;
        private SNSInitConfig conf;
        private SNSCountryPicker countryPicker;
        private SNSJsonCustomization customization;
        private SNSErrorHandler errorHandler;
        private SNSEventHandler eventHandler;
        private SNSIconHandler iconHandler;
        private SNSInstructionsViewHandler instructionsHandler;
        private boolean isAnalyticsEnabled;
        private boolean isDebug;
        private Locale locale;
        private Logger logTree;
        private List<? extends SNSModule> modules;
        private TokenExpirationHandler onTokenExpiration;
        private Map<String, SNSDocumentDefinition> preferredDocumentsDefinitions;
        private Map<String, String> settings;
        private SNSStateChangedHandler stateChangedHandler;
        private List<SNSSupportItem> supportItems;
        private Integer theme;
        private String url;
        private SNSUrlHandler urlHandler;
        private final WeakReference<Activity> weakActivity;

        public Builder(Activity activity, String str) {
            SNSMobileSDK.INSTANCE.isDebug();
            this.weakActivity = new WeakReference<>(activity);
            this.url = str == null ? "https://api.sumsub.com/" : str;
            this.isAnalyticsEnabled = true;
            this.iconHandler = new SNSDefaultIconHandler();
            this.modules = EmptyList.f23104a;
            this.logTree = d.f17576a;
            this.locale = i.a();
        }

        public final SDK build() {
            return new SNSSDK(this);
        }

        /* renamed from: getAccessToken$idensic_mobile_sdk_aar_release, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: getActionResultHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSActionResultHandler getActionResultHandler() {
            return this.actionResultHandler;
        }

        /* renamed from: getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        /* renamed from: getCompleteHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        /* renamed from: getConf$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSInitConfig getConf() {
            return this.conf;
        }

        /* renamed from: getCountryPicker$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSCountryPicker getCountryPicker() {
            return this.countryPicker;
        }

        /* renamed from: getCustomization$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSJsonCustomization getCustomization() {
            return this.customization;
        }

        /* renamed from: getErrorHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        /* renamed from: getEventHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSEventHandler getEventHandler() {
            return this.eventHandler;
        }

        /* renamed from: getIconHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSIconHandler getIconHandler() {
            return this.iconHandler;
        }

        /* renamed from: getInstructionsHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSInstructionsViewHandler getInstructionsHandler() {
            return this.instructionsHandler;
        }

        /* renamed from: getLocale$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        /* renamed from: getLogTree$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        public final List<SNSModule> getModules$idensic_mobile_sdk_aar_release() {
            return this.modules;
        }

        /* renamed from: getOnTokenExpiration$idensic_mobile_sdk_aar_release, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        public final Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release() {
            return this.preferredDocumentsDefinitions;
        }

        public final Map<String, String> getSettings$idensic_mobile_sdk_aar_release() {
            return this.settings;
        }

        /* renamed from: getStateChangedHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSStateChangedHandler getStateChangedHandler() {
            return this.stateChangedHandler;
        }

        public final List<SNSSupportItem> getSupportItems$idensic_mobile_sdk_aar_release() {
            return this.supportItems;
        }

        /* renamed from: getTheme$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        /* renamed from: getUrl$idensic_mobile_sdk_aar_release, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: getUrlHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSUrlHandler getUrlHandler() {
            return this.urlHandler;
        }

        public final WeakReference<Activity> getWeakActivity$idensic_mobile_sdk_aar_release() {
            return this.weakActivity;
        }

        /* renamed from: isAnalyticsEnabled$idensic_mobile_sdk_aar_release, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* renamed from: isDebug$idensic_mobile_sdk_aar_release, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        public final Builder withAccessToken(String accessToken, TokenExpirationHandler onTokenExpiration) {
            this.accessToken = accessToken;
            this.onTokenExpiration = onTokenExpiration;
            return this;
        }

        public final Builder withCompleteHandler(SNSCompleteHandler completeHandler) {
            this.completeHandler = completeHandler;
            return this;
        }

        public final Builder withLocale(Locale locale) {
            this.locale = locale;
            return this;
        }

        public Builder(Activity activity) {
            this(activity, null);
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$\"\u0004\b'\u0010\rR \u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0013R*\u0010-\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b.\u0010\u0013\"\u0004\b/\u00100R\u001c\u00102\u001a\u0004\u0018\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u00107\u001a\u0004\u0018\u0001068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010<\u001a\u0004\u0018\u00010;8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010A\u001a\u0004\u0018\u00010@8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010F\u001a\u0004\u0018\u00010E8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010K\u001a\u0004\u0018\u00010J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001c\u0010P\u001a\u0004\u0018\u00010O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u001c\u0010U\u001a\u0004\u0018\u00010T8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010Z\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010^\u001a\u00020Y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010[\u001a\u0004\b_\u0010]R\u001a\u0010a\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001a\u0010f\u001a\u00020e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR\u001c\u0010k\u001a\u0004\u0018\u00010j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u001c\u0010p\u001a\u0004\u0018\u00010o8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001c\u0010u\u001a\u0004\u0018\u00010t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR(\u0010z\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010y8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R)\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020~\u0018\u00010y8\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u007f\u0010{\u001a\u0005\b\u0080\u0001\u0010}R\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010o8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010q\u001a\u0005\b\u0082\u0001\u0010sR\"\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/sumsub/sns/core/SNSMobileSDK$SDK;", "", "Lcom/sumsub/sns/core/SNSMobileSDK$Builder;", "builder", "<init>", "(Lcom/sumsub/sns/core/SNSMobileSDK$Builder;)V", "LO9/p;", "launch", "()V", "dismiss", "", "apiUrl", "installUncaughtExceptionHandler$idensic_mobile_sdk_aar_release", "(Ljava/lang/String;)V", "installUncaughtExceptionHandler", "removeUncaughtExceptionHandler$idensic_mobile_sdk_aar_release", "removeUncaughtExceptionHandler", "", "isParametersValid", "()Ljava/util/List;", "Landroid/content/Context;", "context", "Ljava/lang/Thread$UncaughtExceptionHandler;", "prevExceptionHandler", "Lcom/sumsub/sentry/c0;", "createSentryErrorHandler", "(Landroid/content/Context;Ljava/lang/Thread$UncaughtExceptionHandler;)Lcom/sumsub/sentry/c0;", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "weakActivity", "Ljava/lang/ref/WeakReference;", "getWeakActivity$idensic_mobile_sdk_aar_release", "()Ljava/lang/ref/WeakReference;", ImagesContract.URL, "Ljava/lang/String;", "getUrl$idensic_mobile_sdk_aar_release", "()Ljava/lang/String;", "accessToken", "getAccessToken$idensic_mobile_sdk_aar_release", "setAccessToken$idensic_mobile_sdk_aar_release", "Lcom/sumsub/sns/core/SNSModule;", "modules", "Ljava/util/List;", "getModules$idensic_mobile_sdk_aar_release", "Lcom/sumsub/sns/core/data/model/SNSSupportItem;", "supportItems", "getSupportItems$idensic_mobile_sdk_aar_release", "setSupportItems$idensic_mobile_sdk_aar_release", "(Ljava/util/List;)V", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "onTokenExpiration", "Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "getOnTokenExpiration$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/TokenExpirationHandler;", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "completeHandler", "Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "getCompleteHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSCompleteHandler;", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "errorHandler", "Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "getErrorHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSErrorHandler;", "Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "actionResultHandler", "Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "getActionResultHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSActionResultHandler;", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "eventHandler", "Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "getEventHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSEventHandler;", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "iconHandler", "Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "getIconHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "instructionsViewHandler", "Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "getInstructionsViewHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "countryPicker", "Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "getCountryPicker$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSCountryPicker;", "", "isDebug", "Z", "isDebug$idensic_mobile_sdk_aar_release", "()Z", "isAnalyticsEnabled", "isAnalyticsEnabled$idensic_mobile_sdk_aar_release", "Lcom/sumsub/log/logger/Logger;", "logTree", "Lcom/sumsub/log/logger/Logger;", "getLogTree$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/log/logger/Logger;", "Ljava/util/Locale;", "locale", "Ljava/util/Locale;", "getLocale$idensic_mobile_sdk_aar_release", "()Ljava/util/Locale;", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "conf", "Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "getConf$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/model/SNSInitConfig;", "", "theme", "Ljava/lang/Integer;", "getTheme$idensic_mobile_sdk_aar_release", "()Ljava/lang/Integer;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "customization", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "getCustomization$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "", "settings", "Ljava/util/Map;", "getSettings$idensic_mobile_sdk_aar_release", "()Ljava/util/Map;", "Lcom/sumsub/sns/core/data/model/SNSDocumentDefinition;", "preferredDocumentsDefinitions", "getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release", "autoCloseOnApproveTimeout", "getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_release", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "snsUrlHandler", "Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "getSnsUrlHandler$idensic_mobile_sdk_aar_release", "()Lcom/sumsub/sns/core/data/listener/SNSUrlHandler;", "exceptionHandler", "Ljava/lang/Thread$UncaughtExceptionHandler;", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static abstract class SDK {
        private String accessToken;
        private final SNSActionResultHandler actionResultHandler;
        private final Integer autoCloseOnApproveTimeout;
        private final SNSCompleteHandler completeHandler;
        private final SNSInitConfig conf;
        private final SNSCountryPicker countryPicker;
        private final SNSJsonCustomization customization;
        private final SNSErrorHandler errorHandler;
        private final SNSEventHandler eventHandler;
        private Thread.UncaughtExceptionHandler exceptionHandler;
        private final SNSIconHandler iconHandler;
        private final SNSInstructionsViewHandler instructionsViewHandler;
        private final boolean isAnalyticsEnabled;
        private final boolean isDebug;
        private final Locale locale;
        private final Logger logTree;
        private final List<SNSModule> modules;
        private final TokenExpirationHandler onTokenExpiration;
        private final Map<String, SNSDocumentDefinition> preferredDocumentsDefinitions;
        private final Map<String, String> settings;
        private final SNSUrlHandler snsUrlHandler;
        private List<SNSSupportItem> supportItems;
        private final Integer theme;
        private final String url;
        private final WeakReference<Activity> weakActivity;

        public SDK(Builder builder) {
            String str;
            Context applicationContext;
            String c2;
            this.weakActivity = builder.getWeakActivity$idensic_mobile_sdk_aar_release();
            String url = builder.getUrl();
            if (url.length() <= 0 || !e.p(url.charAt(C0969n.c0(url)), '/', false)) {
                str = builder.getUrl() + '/';
            } else {
                str = builder.getUrl();
            }
            this.url = str;
            this.accessToken = builder.getAccessToken();
            this.modules = builder.getModules$idensic_mobile_sdk_aar_release();
            this.supportItems = builder.getSupportItems$idensic_mobile_sdk_aar_release();
            this.onTokenExpiration = builder.getOnTokenExpiration();
            this.completeHandler = builder.getCompleteHandler();
            this.errorHandler = builder.getErrorHandler();
            this.actionResultHandler = builder.getActionResultHandler();
            this.eventHandler = builder.getEventHandler();
            this.iconHandler = builder.getIconHandler();
            this.instructionsViewHandler = builder.getInstructionsHandler();
            this.countryPicker = builder.getCountryPicker();
            this.isDebug = builder.getIsDebug();
            this.isAnalyticsEnabled = builder.getIsAnalyticsEnabled();
            this.logTree = builder.getLogTree();
            this.locale = builder.getLocale();
            this.conf = builder.getConf();
            this.theme = builder.getTheme();
            this.customization = builder.getCustomization();
            this.settings = builder.getSettings$idensic_mobile_sdk_aar_release();
            this.preferredDocumentsDefinitions = builder.getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release();
            this.autoCloseOnApproveTimeout = builder.getAutoCloseOnApproveTimeout();
            this.snsUrlHandler = builder.getUrlHandler();
            List<String> isParametersValid = isParametersValid();
            if (!isParametersValid.isEmpty()) {
                throw new SNSInvalidParametersException(isParametersValid);
            }
            Activity activity = builder.getWeakActivity$idensic_mobile_sdk_aar_release().get();
            Context applicationContext2 = activity != null ? activity.getApplicationContext() : null;
            e0 e0Var = e0.f15081a;
            String packageName = applicationContext2 != null ? applicationContext2.getPackageName() : null;
            String str2 = CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN;
            packageName = packageName == null ? CameraInfo.IMPLEMENTATION_TYPE_UNKNOWN : packageName;
            if (applicationContext2 != null && (c2 = i.c(applicationContext2)) != null) {
                str2 = c2;
            }
            e0Var.a(packageName, str2, applicationContext2 != null ? i.b(applicationContext2) : -1);
            if (applicationContext2 == null || (applicationContext = applicationContext2.getApplicationContext()) == null) {
                return;
            }
            ProviderInstaller.installIfNeededAsync(applicationContext, new ProviderInstaller.ProviderInstallListener() { // from class: com.sumsub.sns.core.SNSMobileSDK$SDK$1$1
                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstallFailed(int errorCode, Intent resolveIntent) {
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "SDK", com.google.android.gms.measurement.internal.a.g(errorCode, "onProviderInstallFailed: "), null, 4, null);
                }

                @Override // com.google.android.gms.security.ProviderInstaller.ProviderInstallListener
                public void onProviderInstalled() {
                    Logger.d$default(com.sumsub.sns.internal.log.a.f17535a, "SDK", "onProviderInstalled", null, 4, null);
                }
            });
        }

        private final c0 createSentryErrorHandler(final Context context, Thread.UncaughtExceptionHandler prevExceptionHandler) {
            return new c0(context, new InterfaceC0635a<String>() { // from class: com.sumsub.sns.core.SNSMobileSDK$SDK$createSentryErrorHandler$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // ca.InterfaceC0635a
                public final String invoke() {
                    try {
                        String string = context.getSharedPreferences("idensic_mobile_sdk", 0).getString("applicant_id", "unknown");
                        return string == null ? "unknown" : string;
                    } catch (Exception unused) {
                        return "unknown";
                    }
                }
            }, prevExceptionHandler);
        }

        private final List<String> isParametersValid() {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (this.url.length() == 0) {
                arrayList2.add("Api url must be non-empty. url=" + this.url);
            }
            if (!g0.c(this.url)) {
                arrayList2.add("Api url must be valid. url=" + this.url);
            }
            List<SNSSupportItem> list = this.supportItems;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    String isValid = ((SNSSupportItem) it.next()).isValid();
                    if (isValid != null) {
                        arrayList.add(isValid);
                    }
                }
            } else {
                arrayList = null;
            }
            ArrayList arrayList3 = arrayList;
            if (arrayList3 != null && (!arrayList3.isEmpty())) {
                arrayList2.add("Support items have invalid support items. Why are support items invalid? (" + s.P(arrayList3, null, null, null, new InterfaceC0646l<String, CharSequence>() { // from class: com.sumsub.sns.core.SNSMobileSDK$SDK$isParametersValid$1
                    @Override // ca.InterfaceC0646l
                    public final CharSequence invoke(String str) {
                        return str;
                    }
                }, 31) + ')');
            }
            return arrayList2;
        }

        public final void dismiss() {
            Activity activity = this.weakActivity.get();
            if (activity != null) {
                Intent intent = new Intent("com.sumsub.sns.intent.ACTION_CLOSE");
                intent.setPackage(SNSMobileSDK.INSTANCE.getPackageName());
                activity.sendBroadcast(intent);
            }
        }

        /* renamed from: getAccessToken$idensic_mobile_sdk_aar_release, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        /* renamed from: getActionResultHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSActionResultHandler getActionResultHandler() {
            return this.actionResultHandler;
        }

        /* renamed from: getAutoCloseOnApproveTimeout$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Integer getAutoCloseOnApproveTimeout() {
            return this.autoCloseOnApproveTimeout;
        }

        /* renamed from: getCompleteHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSCompleteHandler getCompleteHandler() {
            return this.completeHandler;
        }

        /* renamed from: getConf$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSInitConfig getConf() {
            return this.conf;
        }

        /* renamed from: getCountryPicker$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSCountryPicker getCountryPicker() {
            return this.countryPicker;
        }

        /* renamed from: getCustomization$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSJsonCustomization getCustomization() {
            return this.customization;
        }

        /* renamed from: getErrorHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        /* renamed from: getEventHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSEventHandler getEventHandler() {
            return this.eventHandler;
        }

        /* renamed from: getIconHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSIconHandler getIconHandler() {
            return this.iconHandler;
        }

        /* renamed from: getInstructionsViewHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSInstructionsViewHandler getInstructionsViewHandler() {
            return this.instructionsViewHandler;
        }

        /* renamed from: getLocale$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Locale getLocale() {
            return this.locale;
        }

        /* renamed from: getLogTree$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Logger getLogTree() {
            return this.logTree;
        }

        public final List<SNSModule> getModules$idensic_mobile_sdk_aar_release() {
            return this.modules;
        }

        /* renamed from: getOnTokenExpiration$idensic_mobile_sdk_aar_release, reason: from getter */
        public final TokenExpirationHandler getOnTokenExpiration() {
            return this.onTokenExpiration;
        }

        public final Map<String, SNSDocumentDefinition> getPreferredDocumentsDefinitions$idensic_mobile_sdk_aar_release() {
            return this.preferredDocumentsDefinitions;
        }

        public final Map<String, String> getSettings$idensic_mobile_sdk_aar_release() {
            return this.settings;
        }

        /* renamed from: getSnsUrlHandler$idensic_mobile_sdk_aar_release, reason: from getter */
        public final SNSUrlHandler getSnsUrlHandler() {
            return this.snsUrlHandler;
        }

        public final List<SNSSupportItem> getSupportItems$idensic_mobile_sdk_aar_release() {
            return this.supportItems;
        }

        /* renamed from: getTheme$idensic_mobile_sdk_aar_release, reason: from getter */
        public final Integer getTheme() {
            return this.theme;
        }

        /* renamed from: getUrl$idensic_mobile_sdk_aar_release, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public final WeakReference<Activity> getWeakActivity$idensic_mobile_sdk_aar_release() {
            return this.weakActivity;
        }

        public final void installUncaughtExceptionHandler$idensic_mobile_sdk_aar_release(String apiUrl) {
            Context applicationContext;
            this.exceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            Activity activity = this.weakActivity.get();
            if (activity == null || (applicationContext = activity.getApplicationContext()) == null) {
                return;
            }
            com.sumsub.sns.internal.log.cacher.e eVar = new com.sumsub.sns.internal.log.cacher.e(new q0(applicationContext, apiUrl), applicationContext.getCacheDir());
            eVar.a("_SNSExceptionSink");
            com.sumsub.sns.internal.log.cacher.d.f17543a.a(eVar);
            Thread.setDefaultUncaughtExceptionHandler(createSentryErrorHandler(applicationContext, new SNSExceptionHandler(applicationContext, eVar, this.exceptionHandler)));
        }

        /* renamed from: isAnalyticsEnabled$idensic_mobile_sdk_aar_release, reason: from getter */
        public final boolean getIsAnalyticsEnabled() {
            return this.isAnalyticsEnabled;
        }

        /* renamed from: isDebug$idensic_mobile_sdk_aar_release, reason: from getter */
        public final boolean getIsDebug() {
            return this.isDebug;
        }

        public final void removeUncaughtExceptionHandler$idensic_mobile_sdk_aar_release() {
            Thread.setDefaultUncaughtExceptionHandler(this.exceptionHandler);
        }

        public final void setAccessToken$idensic_mobile_sdk_aar_release(String str) {
            this.accessToken = str;
        }

        public final void setSupportItems$idensic_mobile_sdk_aar_release(List<SNSSupportItem> list) {
            this.supportItems = list;
        }

        public void launch() {
        }
    }
}
