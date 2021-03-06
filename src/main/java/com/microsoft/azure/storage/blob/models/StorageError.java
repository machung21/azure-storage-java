/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.storage.blob.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * The StorageError model.
 */
@JacksonXmlRootElement(localName = "StorageError")
public final class StorageError {
    /**
     * The message property.
     */
    @JsonProperty(value = "Message")
    private String message;

    /**
     * Get the message value.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set.
     * @return the StorageError object itself.
     */
    public StorageError withMessage(String message) {
        this.message = message;
        return this;
    }
}
