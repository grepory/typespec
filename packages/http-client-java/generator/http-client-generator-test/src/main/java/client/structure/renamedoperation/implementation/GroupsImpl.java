// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package client.structure.renamedoperation.implementation;

import client.structure.service.models.ClientType;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.exception.ClientAuthenticationException;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceModifiedException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in Groups.
 */
public final class GroupsImpl {
    /**
     * The proxy service used to perform REST calls.
     */
    private final GroupsService service;

    /**
     * The service client containing this operation class.
     */
    private final RenamedOperationClientImpl client;

    /**
     * Initializes an instance of GroupsImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    GroupsImpl(RenamedOperationClientImpl client) {
        this.service = RestProxy.create(GroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for RenamedOperationClientGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{endpoint}/client/structure/{client}")
    @ServiceInterface(name = "RenamedOperationClientGroups")
    public interface GroupsService {
        @Post("/two")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> renamedTwo(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);

        @Post("/two")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> renamedTwoSync(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);

        @Post("/four")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> renamedFour(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);

        @Post("/four")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> renamedFourSync(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);

        @Post("/six")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Void>> renamedSix(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);

        @Post("/six")
        @ExpectedResponses({ 204 })
        @UnexpectedResponseExceptionType(value = ClientAuthenticationException.class, code = { 401 })
        @UnexpectedResponseExceptionType(value = ResourceNotFoundException.class, code = { 404 })
        @UnexpectedResponseExceptionType(value = ResourceModifiedException.class, code = { 409 })
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Response<Void> renamedSixSync(@HostParam("endpoint") String endpoint, @HostParam("client") ClientType client,
            RequestOptions requestOptions, Context context);
    }

    /**
     * The renamedTwo operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renamedTwoWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
            context -> service.renamedTwo(this.client.getEndpoint(), this.client.getClient(), requestOptions, context));
    }

    /**
     * The renamedTwo operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedTwoWithResponse(RequestOptions requestOptions) {
        return service.renamedTwoSync(this.client.getEndpoint(), this.client.getClient(), requestOptions, Context.NONE);
    }

    /**
     * The renamedFour operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renamedFourWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(context -> service.renamedFour(this.client.getEndpoint(), this.client.getClient(),
            requestOptions, context));
    }

    /**
     * The renamedFour operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedFourWithResponse(RequestOptions requestOptions) {
        return service.renamedFourSync(this.client.getEndpoint(), this.client.getClient(), requestOptions,
            Context.NONE);
    }

    /**
     * The renamedSix operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> renamedSixWithResponseAsync(RequestOptions requestOptions) {
        return FluxUtil.withContext(
            context -> service.renamedSix(this.client.getEndpoint(), this.client.getClient(), requestOptions, context));
    }

    /**
     * The renamedSix operation.
     * 
     * @param requestOptions The options to configure the HTTP request before HTTP client sends it.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws ClientAuthenticationException thrown if the request is rejected by server on status code 401.
     * @throws ResourceNotFoundException thrown if the request is rejected by server on status code 404.
     * @throws ResourceModifiedException thrown if the request is rejected by server on status code 409.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renamedSixWithResponse(RequestOptions requestOptions) {
        return service.renamedSixSync(this.client.getEndpoint(), this.client.getClient(), requestOptions, Context.NONE);
    }
}
