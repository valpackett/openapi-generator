# coding: utf-8

"""
    Echo Server API

    Echo Server API

    The version of the OpenAPI document: 0.1.0
    Contact: team@openapitools.org
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import re  # noqa: F401
import io
import warnings

from pydantic import validate_call, ValidationError
from typing import Dict, List, Optional, Tuple

from pydantic import StrictBool, StrictInt, StrictStr

from typing import Optional


from openapi_client.api_client import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.exceptions import (  # noqa: F401
    ApiTypeError,
    ApiValueError
)


class FormApi:
    """NOTE: This class is auto generated by OpenAPI Generator
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    def __init__(self, api_client=None) -> None:
        if api_client is None:
            api_client = ApiClient.get_default()
        self.api_client = api_client

    @validate_call
    def test_form_integer_boolean_string(
        self,
        integer_form: Optional[StrictInt] = None,
        boolean_form: Optional[StrictBool] = None,
        string_form: Optional[StrictStr] = None,
        **kwargs,
    ) -> str:
        """Test form parameter(s)  # noqa: E501

        Test form parameter(s)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.test_form_integer_boolean_string(integer_form, boolean_form, string_form, async_req=True)
        >>> result = thread.get()

        :param integer_form:
        :type integer_form: int
        :param boolean_form:
        :type boolean_form: bool
        :param string_form:
        :type string_form: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: str
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the test_form_integer_boolean_string_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)

        return self.test_form_integer_boolean_string_with_http_info.raw_function(
            integer_form,
            boolean_form,
            string_form,
            **kwargs,
        )

    @validate_call
    def test_form_integer_boolean_string_with_http_info(
        self,
        integer_form: Optional[StrictInt] = None,
        boolean_form: Optional[StrictBool] = None,
        string_form: Optional[StrictStr] = None,
        **kwargs,
    ) -> ApiResponse:
        """Test form parameter(s)  # noqa: E501

        Test form parameter(s)  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.test_form_integer_boolean_string_with_http_info(integer_form, boolean_form, string_form, async_req=True)
        >>> result = thread.get()

        :param integer_form:
        :type integer_form: int
        :param boolean_form:
        :type boolean_form: bool
        :param string_form:
        :type string_form: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(str, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'integer_form',
            'boolean_form',
            'string_form'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method test_form_integer_boolean_string" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats: Dict[str, str] = {}

        # process the path parameters
        _path_params: Dict[str, str] = {}

        # process the query parameters
        _query_params: List[Tuple[str, str]] = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[str, str] = {}
        if _params['integer_form'] is not None:
            _form_params.append(('integer_form', _params['integer_form']))

        if _params['boolean_form'] is not None:
            _form_params.append(('boolean_form', _params['boolean_form']))

        if _params['string_form'] is not None:
            _form_params.append(('string_form', _params['string_form']))

        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501

        # set the HTTP header `Content-Type`
        _content_types_list = _params.get('_content_type',
            self.api_client.select_header_content_type(
                ['application/x-www-form-urlencoded']))
        if _content_types_list:
                _header_params['Content-Type'] = _content_types_list

        # authentication setting
        _auth_settings: List[str] = []  # noqa: E501

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str",
        }

        return self.api_client.call_api(
            '/form/integer/boolean/string', 'POST',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))

    @validate_call
    def test_form_oneof(
        self,
        form1: Optional[StrictStr] = None,
        form2: Optional[StrictInt] = None,
        form3: Optional[StrictStr] = None,
        form4: Optional[StrictBool] = None,
        id: Optional[StrictInt] = None,
        name: Optional[StrictStr] = None,
        **kwargs,
    ) -> str:
        """Test form parameter(s) for oneOf schema  # noqa: E501

        Test form parameter(s) for oneOf schema  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.test_form_oneof(form1, form2, form3, form4, id, name, async_req=True)
        >>> result = thread.get()

        :param form1:
        :type form1: str
        :param form2:
        :type form2: int
        :param form3:
        :type form3: str
        :param form4:
        :type form4: bool
        :param id:
        :type id: int
        :param name:
        :type name: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _request_timeout: timeout setting for this request.
               If one number provided, it will be total request
               timeout. It can also be a pair (tuple) of
               (connection, read) timeouts.
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: str
        """
        kwargs['_return_http_data_only'] = True
        if '_preload_content' in kwargs:
            message = "Error! Please call the test_form_oneof_with_http_info method with `_preload_content` instead and obtain raw data from ApiResponse.raw_data"  # noqa: E501
            raise ValueError(message)

        return self.test_form_oneof_with_http_info.raw_function(
            form1,
            form2,
            form3,
            form4,
            id,
            name,
            **kwargs,
        )

    @validate_call
    def test_form_oneof_with_http_info(
        self,
        form1: Optional[StrictStr] = None,
        form2: Optional[StrictInt] = None,
        form3: Optional[StrictStr] = None,
        form4: Optional[StrictBool] = None,
        id: Optional[StrictInt] = None,
        name: Optional[StrictStr] = None,
        **kwargs,
    ) -> ApiResponse:
        """Test form parameter(s) for oneOf schema  # noqa: E501

        Test form parameter(s) for oneOf schema  # noqa: E501
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please pass async_req=True

        >>> thread = api.test_form_oneof_with_http_info(form1, form2, form3, form4, id, name, async_req=True)
        >>> result = thread.get()

        :param form1:
        :type form1: str
        :param form2:
        :type form2: int
        :param form3:
        :type form3: str
        :param form4:
        :type form4: bool
        :param id:
        :type id: int
        :param name:
        :type name: str
        :param async_req: Whether to execute the request asynchronously.
        :type async_req: bool, optional
        :param _preload_content: if False, the ApiResponse.data will
                                 be set to none and raw_data will store the
                                 HTTP response body without reading/decoding.
                                 Default is True.
        :type _preload_content: bool, optional
        :param _return_http_data_only: response data instead of ApiResponse
                                       object with status code, headers, etc
        :type _return_http_data_only: bool, optional
        :param _request_timeout: timeout setting for this request. If one
                                 number provided, it will be total request
                                 timeout. It can also be a pair (tuple) of
                                 (connection, read) timeouts.
        :param _request_auth: set to override the auth_settings for an a single
                              request; this effectively ignores the authentication
                              in the spec for a single request.
        :type _request_auth: dict, optional
        :type _content_type: string, optional: force content-type for the request
        :return: Returns the result object.
                 If the method is called asynchronously,
                 returns the request thread.
        :rtype: tuple(str, status_code(int), headers(HTTPHeaderDict))
        """

        _params = locals()

        _all_params = [
            'form1',
            'form2',
            'form3',
            'form4',
            'id',
            'name'
        ]
        _all_params.extend(
            [
                'async_req',
                '_return_http_data_only',
                '_preload_content',
                '_request_timeout',
                '_request_auth',
                '_content_type',
                '_headers'
            ]
        )

        # validate the arguments
        for _key, _val in _params['kwargs'].items():
            if _key not in _all_params:
                raise ApiTypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method test_form_oneof" % _key
                )
            _params[_key] = _val
        del _params['kwargs']

        _collection_formats: Dict[str, str] = {}

        # process the path parameters
        _path_params: Dict[str, str] = {}

        # process the query parameters
        _query_params: List[Tuple[str, str]] = []
        # process the header parameters
        _header_params = dict(_params.get('_headers', {}))
        # process the form parameters
        _form_params: List[Tuple[str, str]] = []
        _files: Dict[str, str] = {}
        if _params['form1'] is not None:
            _form_params.append(('form1', _params['form1']))

        if _params['form2'] is not None:
            _form_params.append(('form2', _params['form2']))

        if _params['form3'] is not None:
            _form_params.append(('form3', _params['form3']))

        if _params['form4'] is not None:
            _form_params.append(('form4', _params['form4']))

        if _params['id'] is not None:
            _form_params.append(('id', _params['id']))

        if _params['name'] is not None:
            _form_params.append(('name', _params['name']))

        # process the body parameter
        _body_params = None
        # set the HTTP header `Accept`
        _header_params['Accept'] = self.api_client.select_header_accept(
            ['text/plain'])  # noqa: E501

        # set the HTTP header `Content-Type`
        _content_types_list = _params.get('_content_type',
            self.api_client.select_header_content_type(
                ['application/x-www-form-urlencoded']))
        if _content_types_list:
                _header_params['Content-Type'] = _content_types_list

        # authentication setting
        _auth_settings: List[str] = []  # noqa: E501

        _response_types_map: Dict[str, Optional[str]] = {
            '200': "str",
        }

        return self.api_client.call_api(
            '/form/oneof', 'POST',
            _path_params,
            _query_params,
            _header_params,
            body=_body_params,
            post_params=_form_params,
            files=_files,
            response_types_map=_response_types_map,
            auth_settings=_auth_settings,
            async_req=_params.get('async_req'),
            _return_http_data_only=_params.get('_return_http_data_only'),  # noqa: E501
            _preload_content=_params.get('_preload_content', True),
            _request_timeout=_params.get('_request_timeout'),
            collection_formats=_collection_formats,
            _request_auth=_params.get('_request_auth'))