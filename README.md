# ncloud-sdk-java

ncloud-sdk-java is the official Naver Cloud Platform SDK for the JAVA programming language.

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
	<groupId>com.ncloud</groupId>
	<artifactId>ncloud-sdk-java</artifactId>
	<version>1.0.0</version>
	<scope>compile</scope>
</dependency>
```

### Others

At first generate the JAR by executing:

	mvn package

Then manually install the following JARs:

* sdk/target/sdk-1.0.0-jar-with-dependencies.jar

## Getting Started

Please follow the [installation](#installation) instruction and create a credentials properties file.
The path to the configuration file is .ncloud/configure in the HOME directory.
* configure example
```
ncloud_access_key_id=your-access-key
ncloud_secret_access_key=your-secret-key
```

And execute the following Java code:

```java
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import com.ncloud.auth.*;
import com.ncloud.marshaller.*;
import com.ncloud.exception.*;
import com.ncloud.server.api.V2Api;
import com.ncloud.server.model.*;

public class V2ApiExample {

	public static void main(String[] args) {
		ApiClient apiClient = new ApiClient.ApiClientBuilder()
            .addMarshaller(JsonMarshaller.getInstance())
            .addMarshaller(XmlMarshaller.getInstance())
            .addMarshaller(FormMarshaller.getInstance())
            .setCredentials(new NcloudCredentialsProvider().getCredentials())
            .setLogging(true)
            .build();

        V2Api apiInstance = new V2Api(apiClient);
        AddNasVolumeAccessControlRequest addNasVolumeAccessControlRequest = new AddNasVolumeAccessControlRequest(); // AddNasVolumeAccessControlRequest | addNasVolumeAccessControlRequest
        try {
            // Handler Successful response
            ApiResponse<AddNasVolumeAccessControlResponse> result = apiInstance.addNasVolumeAccessControlGet(addNasVolumeAccessControlRequest);
        } catch (ApiException e) {
            // Handler Failed response
            int statusCode = e.getHttpStatusCode();
            Map<String, List<String>> responseHeaders = e.getHttpHeaders();
            InputStream byteStream = e.getByteStream();
            e.printStackTrace();
        } catch (SdkException e) {
            // Handle exceptions that occurred before communication with the server
            e.printStackTrace();
        }
	}
}

```

If credentials are not specified, the default credential provider chain is used. The default credential provider chain looks for credentials in the following order:
 
1. EnvironmentVariableCredentialsProvider: Use the NCLOUD_ACCESS_KEY_ID (or NCLOUD_ACCESS_KEY) and NCLOUD_SECRET_KEY (or NCLOUD_SECRET_ACCESS_KEY) environment variables. 
2. NcloudCredentialsProvider: Use configuration file. The path to the configuration file is .ncloud/configure in the HOME directory.
3. ServerRoleCredentialsProvider: Used on VPC Server instances, and delivered through the ncloud metadata api. Server Role can be set in the NCP Sub Account console.

## Documentation for individual modules

| Services       | Documentation                                       |
| -------------- | --------------------------------------------------- |
| _Server_       | [**Server**](services/server/README.md)             |
| _Loadbalancer_ | [**Loadbalancer**](services/loadbalancer/README.md) |
| _Autoscaling_  | [**Autoscaling**](services/autoscaling/README.md)   |
| _Monitoring_   | [**Monitoring**](services/monitoring/README.md)     |
| _CDN_          | [**CDN**](services/cdn/README.md)                   |
| _CloudDB_      | [**CloudDB**](services/clouddb/README.md)           |
| _Server(VPC)_      | [**Server(VPC)**](services/vserver/README.md)           |
| _VPC_      | [**VPC**](services/vpc/README.md)           |
| _Nas(VPC)_      | [**Nas(VPC)**](services/vnas/README.md)           |
| _Autoscaling(VPC)_      | [**Autoscaling(VPC)**](services/vautoscaling/README.md)           |
| _Loadbalancer(VPC)_      | [**Loadbalancer(VPC)**](services/vloadbalancer/README.md)           |

### License

```
Copyright (c) 2021 NAVER Cloud Corp.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.  IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
```
