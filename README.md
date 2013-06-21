diffpatch
=========

A fork from google-diff-match-patch

The Diff Match and Patch libraries offer robust algorithms to perform the operations required for synchronizing plain text.

* Diff: Compare two blocks of plain text and efficiently return a list of differences.
* Match: Given a search string, find its best fuzzy match in a block of plain text. Weighted for both accuracy and location.
* Patch: Apply a list of patches onto plain text. Use best-effort to apply patch even when the underlying text doesn't match.


## Including diffpatch in your project

Diffpatch is available on maven central. Add the dependency to your pom.xml:

Maven:

```xml
<dependency>
    <groupId>com.sksamuel.diff</groupId>
    <artifactId>diff</artifactId>
    <version>1.1.11</version>
</dependency>
```

If using SBT then you want:

```
libraryDependencies += "com.sksamuel.diff" % "diff" % "1.1.11"
```

## License
```
This software is licensed under the Apache 2 license, quoted below.

Copyright 2013 Stephen Samuel
Original code Copyright 2006 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License. You may obtain a copy of
the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
License for the specific language governing permissions and limitations under
the License.
```
