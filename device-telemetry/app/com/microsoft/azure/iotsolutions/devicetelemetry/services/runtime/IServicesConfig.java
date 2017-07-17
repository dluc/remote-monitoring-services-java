// Copyright (c) Microsoft. All rights reserved.

package com.microsoft.azure.iotsolutions.devicetelemetry.services.runtime;

public interface IServicesConfig {

    /**
     * Get storage dependency connection string
     *
     * @return Connection string
     */
    String getStorageConnString();
}