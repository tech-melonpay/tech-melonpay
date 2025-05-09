package com.luminary.business.presentation.utils.lifecycle;

import J8.b;
import android.R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.ActivityC0533g;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0557x;
import androidx.lifecycle.r;
import com.luminary.business.presentation.utils.lifecycle.KeyboardTriggerBehavior;

/* compiled from: KeyboardTriggerBehavior.kt */
/* loaded from: classes2.dex */
public final class KeyboardTriggerBehavior extends AbstractC0557x<Status> {

    /* renamed from: a, reason: collision with root package name */
    public final View f13332a;

    /* renamed from: b, reason: collision with root package name */
    public final b f13333b = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: J8.b
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            Rect rect = new Rect();
            KeyboardTriggerBehavior keyboardTriggerBehavior = KeyboardTriggerBehavior.this;
            keyboardTriggerBehavior.f13332a.getWindowVisibleDisplayFrame(rect);
            if (keyboardTriggerBehavior.f13332a.getRootView().getHeight() - rect.bottom > rect.height() * 0.15d) {
                KeyboardTriggerBehavior.Status status = KeyboardTriggerBehavior.Status.f13334a;
                if (keyboardTriggerBehavior.getValue() != status) {
                    keyboardTriggerBehavior.setValue(status);
                    return;
                }
                return;
            }
            KeyboardTriggerBehavior.Status status2 = KeyboardTriggerBehavior.Status.f13335b;
            if (keyboardTriggerBehavior.getValue() != status2) {
                keyboardTriggerBehavior.setValue(status2);
            }
        }
    };

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KeyboardTriggerBehavior.kt */
    public static final class Status {

        /* renamed from: a, reason: collision with root package name */
        public static final Status f13334a;

        /* renamed from: b, reason: collision with root package name */
        public static final Status f13335b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Status[] f13336c;

        static {
            Status status = new Status("OPEN", 0);
            f13334a = status;
            Status status2 = new Status("CLOSED", 1);
            f13335b = status2;
            f13336c = new Status[]{status, status2};
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f13336c.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [J8.b] */
    public KeyboardTriggerBehavior(ActivityC0533g activityC0533g) {
        this.f13332a = activityC0533g.findViewById(R.id.content);
    }

    public final void a() {
        boolean hasObservers = hasObservers();
        b bVar = this.f13333b;
        View view = this.f13332a;
        if (hasObservers) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        } else {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(bVar);
        }
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void observe(r rVar, A<? super Status> a10) {
        super.observe(rVar, a10);
        a();
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void observeForever(A<? super Status> a10) {
        super.observeForever(a10);
        a();
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void removeObserver(A<? super Status> a10) {
        super.removeObserver(a10);
        a();
    }

    @Override // androidx.lifecycle.AbstractC0557x
    public final void removeObservers(r rVar) {
        super.removeObservers(rVar);
        a();
    }
}
