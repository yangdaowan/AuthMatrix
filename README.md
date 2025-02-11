# AuthMatrix

### 目录结构

~~~
AuthMatrix                              根目录，提供统一的版本管理
├─auth-matrix-dependencies              提供统一的依赖管理
├─auth-matrix-parent                    提供统一的构建管理
└─auth-matrix-project                   提供统一的项目管理
├─auth-matrix-core                      核心基础模块
│  ├─auth-matrix-base                   核心接口定义（认证/权限/审计）
│  ├─auth-matrix-common                 通用工具类、异常处理、基础DTO
│  ├─auth-matrix-data                   数据模型定义（JPA实体/MyBatis映射）
│  └─auth-matrix-encryption             加密算法实现
├─auth-matrix-extend                    功能扩展模块
├─auth-matrix-service                   业务服务模块
│  ├─auth-matrix-audit                  审计服务
│  ├─auth-matrix-authn                  认证服务（OIDC/SAML/短信/微信）
│  ├─auth-matrix-authz                  权限服务（RBAC/ABAC/数据权限）
│  └─auth-matrix-gateway                统一认证网关（路由/协议转换）
└─auth-matrix-starter                   快速启动模块
~~~