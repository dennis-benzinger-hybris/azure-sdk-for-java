// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Jobs. */
public interface Jobs {
    /**
     * Lists all the jobs available under the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Resource Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobResource> list();

    /**
     * Lists all the jobs available under the subscription.
     *
     * @param skipToken $skipToken is supported on Get list of jobs, which provides the next page in the list of jobs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Resource Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobResource> list(String skipToken, Context context);

    /**
     * Lists all the jobs available under the given resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Resource Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobResource> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the jobs available under the given resource group.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param skipToken $skipToken is supported on Get list of jobs, which provides the next page in the list of jobs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job Resource Collection as paginated response with {@link PagedIterable}.
     */
    PagedIterable<JobResource> listByResourceGroup(String resourceGroupName, String skipToken, Context context);

    /**
     * Gets information about the specified job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param expand $expand is supported on details parameter for job, which provides details on the job stages.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified job along with {@link Response}.
     */
    Response<JobResource> getByResourceGroupWithResponse(
        String resourceGroupName, String jobName, String expand, Context context);

    /**
     * Gets information about the specified job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified job.
     */
    JobResource getByResourceGroup(String resourceGroupName, String jobName);

    /**
     * Deletes a job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String jobName);

    /**
     * Deletes a job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String jobName, Context context);

    /**
     * Book shipment pick up.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param shipmentPickUpRequest Details of shipment pick up request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shipment pick up response along with {@link Response}.
     */
    Response<ShipmentPickUpResponse> bookShipmentPickUpWithResponse(
        String resourceGroupName, String jobName, ShipmentPickUpRequest shipmentPickUpRequest, Context context);

    /**
     * Book shipment pick up.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param shipmentPickUpRequest Details of shipment pick up request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shipment pick up response.
     */
    ShipmentPickUpResponse bookShipmentPickUp(
        String resourceGroupName, String jobName, ShipmentPickUpRequest shipmentPickUpRequest);

    /**
     * CancelJob.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param cancellationReason Reason for cancellation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> cancelWithResponse(
        String resourceGroupName, String jobName, CancellationReason cancellationReason, Context context);

    /**
     * CancelJob.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param cancellationReason Reason for cancellation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(String resourceGroupName, String jobName, CancellationReason cancellationReason);

    /**
     * This method gets the unencrypted secrets related to the job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of unencrypted credentials for accessing device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UnencryptedCredentials> listCredentials(String resourceGroupName, String jobName);

    /**
     * This method gets the unencrypted secrets related to the job.
     *
     * @param resourceGroupName The Resource Group Name.
     * @param jobName The name of the job Resource within the specified resource group. job names must be between 3 and
     *     24 characters in length and use any alphanumeric and underscore only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of unencrypted credentials for accessing device as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UnencryptedCredentials> listCredentials(String resourceGroupName, String jobName, Context context);

    /**
     * Gets information about the specified job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified job along with {@link Response}.
     */
    JobResource getById(String id);

    /**
     * Gets information about the specified job.
     *
     * @param id the resource ID.
     * @param expand $expand is supported on details parameter for job, which provides details on the job stages.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified job along with {@link Response}.
     */
    Response<JobResource> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes a job.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a job.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new JobResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new JobResource definition.
     */
    JobResource.DefinitionStages.Blank define(String name);
}
