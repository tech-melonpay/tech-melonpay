package net.sf.scuba.smartcards;

/* loaded from: classes2.dex */
public class WrappingCardService extends CardService {
    private boolean enabled;
    private CardService service;
    private APDUWrapper wrapper;

    public WrappingCardService(CardService cardService, APDUWrapper aPDUWrapper) {
        this.service = cardService;
        this.wrapper = aPDUWrapper;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void close() {
        this.service.close();
    }

    public void disable() {
        this.enabled = false;
    }

    public void enable() {
        this.enabled = true;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public byte[] getATR() {
        return this.service.getATR();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public boolean isConnectionLost(Exception exc) {
        return this.service.isConnectionLost(exc);
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // net.sf.scuba.smartcards.CardService
    public boolean isOpen() {
        return this.service.isOpen();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public void open() {
        this.service.open();
    }

    @Override // net.sf.scuba.smartcards.CardService
    public ResponseAPDU transmit(CommandAPDU commandAPDU) {
        if (!isEnabled()) {
            return this.service.transmit(commandAPDU);
        }
        return this.wrapper.unwrap(this.service.transmit(this.wrapper.wrap(commandAPDU)));
    }
}
