// Copyright (c) Microsoft. All rights reserved.

package com.microsoft.azure.iotsolutions.devicetelemetry.services.storage.cosmosDb;

import com.google.inject.ImplementedBy;
import com.microsoft.azure.documentdb.*;
import com.microsoft.azure.iotsolutions.devicetelemetry.services.exceptions.InvalidConfigurationException;
import com.microsoft.azure.iotsolutions.devicetelemetry.services.models.StatusResultServiceModel;
import com.microsoft.azure.iotsolutions.devicetelemetry.services.models.StatusServiceModel;

import java.util.ArrayList;
import java.util.concurrent.CompletionStage;

@ImplementedBy(StorageClient.class)
public interface IStorageClient {
    DocumentClient getDocumentClient() throws InvalidConfigurationException;

    ResourceResponse<DocumentCollection> createCollectionIfNotExists(String databaseName, String id) throws Exception;

    Document upsertDocument(String databaseName, String colId, Object document) throws Exception;

    Document deleteDocument(String databaseName, String colId, String docId) throws Exception;

    ArrayList<Document> queryDocuments(String databaseName, String colId, FeedOptions queryOptions, SqlQuerySpec querySpec, int skip) throws Exception;

    StatusResultServiceModel ping();
}
