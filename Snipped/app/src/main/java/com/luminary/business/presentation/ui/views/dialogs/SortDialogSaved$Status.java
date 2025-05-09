package com.luminary.business.presentation.ui.views.dialogs;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SortDialogSaved.kt */
/* loaded from: classes2.dex */
public final class SortDialogSaved$Status {

    /* renamed from: a, reason: collision with root package name */
    public static final SortDialogSaved$Status f13226a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ SortDialogSaved$Status[] f13227b;

    static {
        SortDialogSaved$Status sortDialogSaved$Status = new SortDialogSaved$Status("AlphabeticalOrder", 0);
        f13226a = sortDialogSaved$Status;
        f13227b = new SortDialogSaved$Status[]{sortDialogSaved$Status, new SortDialogSaved$Status("ReversedAlphabeticalOrder", 1)};
    }

    public SortDialogSaved$Status() {
        throw null;
    }

    public static SortDialogSaved$Status valueOf(String str) {
        return (SortDialogSaved$Status) Enum.valueOf(SortDialogSaved$Status.class, str);
    }

    public static SortDialogSaved$Status[] values() {
        return (SortDialogSaved$Status[]) f13227b.clone();
    }
}
