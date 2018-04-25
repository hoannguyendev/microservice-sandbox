package net.bakaar.sandbox.cas.domain;

import net.bakaar.sandbox.cas.domain.provider.BusinessIdProvider;

public class CaseDomainObjectFactory {

    private final BusinessIdProvider businessIdProvider;

    public CaseDomainObjectFactory(BusinessIdProvider businessIdProvider) {
        this.businessIdProvider = businessIdProvider;
    }

    public Case createCase(String pnummer) {
        return new Case(businessIdProvider.generateId(), pnummer);
    }
}
