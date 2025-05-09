package com.sumsub.sns.core.theme;

import android.content.Context;
import ca.InterfaceC0635a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "", "Landroid/content/Context;", "context", "LO9/p;", "loadResources", "(Landroid/content/Context;)V", "Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;", "getTheme", "()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;", "Companion", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface SNSJsonCustomization {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/sumsub/sns/core/theme/SNSJsonCustomization$Companion;", "", "<init>", "()V", "Lkotlin/Function0;", "Lcom/sumsub/sns/core/theme/SNSJsonCustomization;", "defaultJsonCustomizationProvider", "Lca/a;", "getDefaultJsonCustomizationProvider", "()Lca/a;", "setDefaultJsonCustomizationProvider", "(Lca/a;)V", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static InterfaceC0635a<? extends SNSJsonCustomization> defaultJsonCustomizationProvider;

        private Companion() {
        }

        public final void setDefaultJsonCustomizationProvider(InterfaceC0635a<? extends SNSJsonCustomization> interfaceC0635a) {
            defaultJsonCustomizationProvider = interfaceC0635a;
        }
    }

    SNSCustomizationTheme getTheme();

    void loadResources(Context context);
}
