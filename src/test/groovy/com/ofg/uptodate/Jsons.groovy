package com.ofg.uptodate

class Jsons {
    public static final String JUNIT_RESPONSE = """
                                            {
                                              "responseHeader": {
                                                "status": 0,
                                                "QTime": 0,
                                                "params": {
                                                  "sort": "score desc,timestamp desc,g asc,a asc,v desc",
                                                  "indent": "off",
                                                  "wt": "json",
                                                  "rows": "5",
                                                  "version": "2.2",
                                                  "fl": "id,g,a,v,p,ec,timestamp,tags",
                                                  "q": "g:\\"junit\\" AND a:\\"junit\\"",
                                                  "core": "gav"
                                                }
                                              },
                                              "response": {
                                                "numFound": 21,
                                                "start": 0,
                                                "docs": [
                                                  {
                                                    "id": "junit:junit:4.12-beta-1",
                                                    "g": "junit",
                                                    "a": "junit",
                                                    "v": "4.12-beta-1",
                                                    "p": "jar",
                                                    "timestamp": 1406493687000,
                                                    "tags": [
                                                      "unit",
                                                      "gamma",
                                                      "created",
                                                      "kent",
                                                      "testing",
                                                      "java",
                                                      "beck",
                                                      "junit",
                                                      "framework",
                                                      "erich"
                                                    ],
                                                    "ec": [
                                                      "-javadoc.jar",
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "junit:junit:4.11",
                                                    "g": "junit",
                                                    "a": "junit",
                                                    "v": "4.11",
                                                    "p": "jar",
                                                    "timestamp": 1352920907000,
                                                    "tags": [
                                                      "kent",
                                                      "regression",
                                                      "junit",
                                                      "used",
                                                      "framework",
                                                      "unit",
                                                      "gamma",
                                                      "tests",
                                                      "developer",
                                                      "written",
                                                      "implements",
                                                      "beck",
                                                      "java",
                                                      "testing",
                                                      "erich"
                                                    ],
                                                    "ec": [
                                                      "-javadoc.jar",
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "junit:junit:4.11-beta-1",
                                                    "g": "junit",
                                                    "a": "junit",
                                                    "v": "4.11-beta-1",
                                                    "p": "jar",
                                                    "timestamp": 1350330353000,
                                                    "tags": [
                                                      "kent",
                                                      "regression",
                                                      "junit",
                                                      "used",
                                                      "framework",
                                                      "unit",
                                                      "gamma",
                                                      "tests",
                                                      "developer",
                                                      "written",
                                                      "implements",
                                                      "beck",
                                                      "java",
                                                      "testing",
                                                      "erich"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      "-javadoc.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "junit:junit:4.10",
                                                    "g": "junit",
                                                    "a": "junit",
                                                    "v": "4.10",
                                                    "p": "jar",
                                                    "timestamp": 1317323543000,
                                                    "tags": [
                                                      "kent",
                                                      "regression",
                                                      "junit",
                                                      "used",
                                                      "framework",
                                                      "unit",
                                                      "gamma",
                                                      "tests",
                                                      "developer",
                                                      "written",
                                                      "implements",
                                                      "beck",
                                                      "java",
                                                      "testing",
                                                      "erich"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      "-javadoc.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "junit:junit:4.9",
                                                    "g": "junit",
                                                    "a": "junit",
                                                    "v": "4.9",
                                                    "p": "jar",
                                                    "timestamp": 1314036946000,
                                                    "tags": [
                                                      "kent",
                                                      "regression",
                                                      "junit",
                                                      "used",
                                                      "framework",
                                                      "unit",
                                                      "gamma",
                                                      "tests",
                                                      "developer",
                                                      "written",
                                                      "implements",
                                                      "beck",
                                                      "java",
                                                      "testing",
                                                      "erich"
                                                    ],
                                                    "ec": [
                                                      "-javadoc.jar",
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  }
                                                ]
                                              }
                                            }
                                            """
    public static final String HIBERNATE_RESPONSE = """
                                            {
                                              "responseHeader": {
                                                "status": 0,
                                                "QTime": 4,
                                                "params": {
                                                  "fl": "id,g,a,v,p,ec,timestamp,tags",
                                                  "sort": "score desc,timestamp desc,g asc,a asc,v desc",
                                                  "indent": "off",
                                                  "q": "g:\\"org.hibernate\\" AND a:\\"hibernate-core\\"",
                                                  "core": "gav",
                                                  "wt": "json",
                                                  "rows": "5",
                                                  "version": "2.2"
                                                }
                                              },
                                              "response": {
                                                "numFound": 102,
                                                "start": 0,
                                                "docs": [
                                                  {
                                                    "id": "org.hibernate:hibernate-core:4.2.15.Final",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "4.2.15.Final",
                                                    "p": "jar",
                                                    "timestamp": 1405579331000,
                                                    "tags": [
                                                      "hibernate",
                                                      "project",
                                                      "module"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "org.hibernate:hibernate-core:4.3.6.Final",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "4.3.6.Final",
                                                    "p": "jar",
                                                    "timestamp": 1405573183000,
                                                    "tags": [
                                                      "functionality",
                                                      "hibernate",
                                                      "provided",
                                                      "core"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "org.hibernate:hibernate-core:4.2.14.Final",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "4.2.14.Final",
                                                    "p": "jar",
                                                    "timestamp": 1403742849000,
                                                    "tags": [
                                                      "hibernate",
                                                      "project",
                                                      "module"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "org.hibernate:hibernate-core:4.2.13.Final",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "4.2.13.Final",
                                                    "p": "jar",
                                                    "timestamp": 1401316019000,
                                                    "tags": [
                                                      "hibernate",
                                                      "project",
                                                      "module"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  },
                                                  {
                                                    "id": "org.hibernate:hibernate-core:4.2.12.Final",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "4.2.12.Final",
                                                    "p": "jar",
                                                    "timestamp": 1396988160000,
                                                    "tags": [
                                                      "hibernate",
                                                      "project",
                                                      "module"
                                                    ],
                                                    "ec": [
                                                      "-sources.jar",
                                                      ".jar",
                                                      ".pom"
                                                    ]
                                                  }
                                                ]
                                              }
                                            }
                                            """

    public static final String NOT_FOUND_GVM_RESPONSE = """
                                        {
                                            "responseHeader": {
                                                "status": 0,
                                                "QTime": 1,
                                                "params": {
                                                    "spellcheck": "true",
                                                    "fl": "id,g,a,latestVersion,p,ec,repositoryId,text,timestamp,versionCount",
                                                    "sort": "score desc,timestamp desc,g asc,a asc",
                                                    "indent": "off",
                                                    "q": "id:\\"net.gvmtool:gvm-sdk\\"",
                                                    "spellcheck.count": "5",
                                                    "wt": "json",
                                                    "version": "2.2"
                                                }
                                            },
                                            "response": {
                                                "numFound": 0,
                                                "start": 0,
                                                "docs": [ ]
                                            },
                                            "spellcheck": {
                                                "suggestions": [
                                                    "gvm",
                                                    {
                                                        "numFound": 5,
                                                        "startOffset": 16,
                                                        "endOffset": 23,
                                                        "suggestion": [
                                                            "jvm",
                                                            "gem",
                                                            "gsm",
                                                            "gcm",
                                                            "gvt"
                                                        ]
                                                    }
                                                ]
                                            }
                                        }
                                        """ 
    
    public static final String RESPONSE_TEMPLATE = '''
                                            {
                                              "response": {
                                                "docs": [
                                                  {
                                                    "id": "org.hibernate:hibernate-core:$artifactVersion",
                                                    "g": "org.hibernate",
                                                    "a": "hibernate-core",
                                                    "v": "$artifactVersion",
                                                    "p": "jar",
                                                    "timestamp": 1405579331000
                                                  }
                                                ]
                                              }
                                            }
                                            '''
}
