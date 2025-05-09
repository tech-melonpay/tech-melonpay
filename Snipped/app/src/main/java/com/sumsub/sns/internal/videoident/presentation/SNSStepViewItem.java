package com.sumsub.sns.internal.videoident.presentation;

import androidx.annotation.Keep;
import kotlin.Metadata;
import org.bouncycastle.i18n.MessageBundle;

@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem;", "", "icon", "", MessageBundle.TITLE_ENTRY, "", "state", "Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem$State;", "(Ljava/lang/String;Ljava/lang/CharSequence;Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem$State;)V", "getIcon", "()Ljava/lang/String;", "getState", "()Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem$State;", "getTitle", "()Ljava/lang/CharSequence;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "State", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SNSStepViewItem {
    private final String icon;
    private final State state;
    private final CharSequence title;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sumsub/sns/internal/videoident/presentation/SNSStepViewItem$State;", "", "(Ljava/lang/String;I)V", "DEFAULT", "SELECTED", "DONE", "idensic-mobile-sdk-aar_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum State {
        DEFAULT,
        SELECTED,
        DONE
    }

    public SNSStepViewItem(String str, CharSequence charSequence, State state) {
        this.icon = str;
        this.title = charSequence;
        this.state = state;
    }

    public static /* synthetic */ SNSStepViewItem copy$default(SNSStepViewItem sNSStepViewItem, String str, CharSequence charSequence, State state, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sNSStepViewItem.icon;
        }
        if ((i & 2) != 0) {
            charSequence = sNSStepViewItem.title;
        }
        if ((i & 4) != 0) {
            state = sNSStepViewItem.state;
        }
        return sNSStepViewItem.copy(str, charSequence, state);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final SNSStepViewItem copy(String icon, CharSequence title, State state) {
        return new SNSStepViewItem(icon, title, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SNSStepViewItem)) {
            return false;
        }
        SNSStepViewItem sNSStepViewItem = (SNSStepViewItem) other;
        return kotlin.jvm.internal.f.b(this.icon, sNSStepViewItem.icon) && kotlin.jvm.internal.f.b(this.title, sNSStepViewItem.title) && this.state == sNSStepViewItem.state;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final State getState() {
        return this.state;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.icon;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CharSequence charSequence = this.title;
        return this.state.hashCode() + ((hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "SNSStepViewItem(icon=" + this.icon + ", title=" + ((Object) this.title) + ", state=" + this.state + ')';
    }
}
