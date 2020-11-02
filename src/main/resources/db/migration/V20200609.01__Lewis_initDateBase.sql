CREATE SCHEMA IF NOT EXISTS "lys";

drop table if exists "lys"."personnel_info" ;


drop sequence if exists "lys"."personnel_id_seq";
create sequence "lys"."personnel_id_seq"
increment 1
minvalue 1
maxvalue 9223372036854775807
start 1
cache 1;

/*==============================================================*/
/* Table: personnelInfo                                         */
/*==============================================================*/
create table "lys"."personnel_info" (
                             personnel_id         VARCHAR(10)          not null,
                             personnel_name       VARCHAR(50)          not null,
                             personnel_sex        VARCHAR(4)           null,
                             birthday             TIMESTAMP            null,
                             id     INT8     not null default nextval('personnel_id_seq'::regclass),
                             wedlock              VARCHAR(4)           null,
                             race                 VARCHAR(50)          null,
                             native_place         VARCHAR(50)          null,
                             politic              VARCHAR(10)          null,
                             e_mail               VARCHAR(10)          null,
                             phone                INT8                 null,
                             address              VARCHAR(100)         null,
                             department           VARCHAR(10)          not null,
                             job                  VARCHAR(10)          not null,
                             duty                 VARCHAR(10)          null,
                             base_salary          INT4                 null,
                             engage_form          VARCHAR(10)          null,
                             tiptop_degree        VARCHAR(10)          null,
                             specialty            VARCHAR(10)          null,
                             school               VARCHAR(10)          null,
                             begin_work_date      TIMESTAMP            not null,
                             work_state           VARCHAR(10)          not null,
                             work_id              INT4                 not null,
                             contract_term        INT2                 null,
                             be_form_date         TIMESTAMP            null,
                             not_work_date        TIMESTAMP            null,
                             begin_contract       TIMESTAMP            null,
                             end_contract         TIMESTAMP            null,
                             work_age             INT2                 null,
                             is_deleted           INT2                 null,
                             constraint PK_PERSONNELINFO primary key (personnel_id)
);

comment on column "lys"."personnel_info"."personnel_id" is
'员工编号';

comment on column "lys"."personnel_info"."personnel_name" is
'员工姓名';

comment on column "lys"."personnel_info"."personnel_sex" is
'员工性别';

comment on column "lys"."personnel_info"."birthday" is
'出生日期';

comment on column "lys"."personnel_info"."id" is
'身份证号码';

comment on column "lys"."personnel_info"."wedlock" is
'婚姻状况';

comment on column "lys"."personnel_info"."race" is
'民族';

comment on column "lys"."personnel_info"."native_place" is
'籍贯';

comment on column "lys"."personnel_info"."politic" is
'整治面貌';

comment on column "lys"."personnel_info"."e_mail" is
'电子邮箱';

comment on column "lys"."personnel_info"."phone" is
'联系电话';

comment on column "lys"."personnel_info"."address" is
'联系地址';

comment on column "lys"."personnel_info"."department" is
'部门';

comment on column "lys"."personnel_info"."job" is
'职位';

comment on column "lys"."personnel_info"."duty" is
'职称';

comment on column "lys"."personnel_info"."base_salary" is
'基本工资';

comment on column "lys"."personnel_info"."engage_form" is
'聘用形式';

comment on column "lys"."personnel_info"."tiptop_degree" is
'最高学历';

comment on column "lys"."personnel_info"."specialty" is
'所属专业';

comment on column "lys"."personnel_info"."school" is
'毕业院校';

comment on column "lys"."personnel_info"."begin_work_date" is
'入职时间';

comment on column "lys"."personnel_info"."work_state" is
'在职状态';

comment on column "lys"."personnel_info"."work_id" is
'工号';

comment on column "lys"."personnel_info"."contract_term" is
'合同期限';

comment on column "lys"."personnel_info"."be_form_date" is
'转正日期';

comment on column "lys"."personnel_info"."not_work_date" is
'离职日期';

comment on column "lys"."personnel_info"."begin_contract" is
'合同起始日期';

comment on column "lys"."personnel_info"."end_contract" is
'合同终止时期';

comment on column "lys"."personnel_info"."work_age" is
'工龄';

comment on column "lys"."personnel_info"."is_deleted" is
'删除状态，0：正常，1：已删除';

comment on table "lys"."personnel_info" is
'员工信息表';


drop table if exists "lys"."personnel_train" ;

/*==============================================================*/
/* Table: personnel_train                                       */
/*==============================================================*/
create table "lys"."personnel_train" (
                               personnel_id         VARCHAR(10)          not null,
                               train_date           TIMESTAMP            null,
                               train_content        VARCHAR(100)         null,
                               remark               VARCHAR(255)         null,
                               constraint PK_PERSONNEL_TRAIN primary key (personnel_id)
);

comment on table "lys"."personnel_train" is
'员工培训表';

comment on column "lys"."personnel_train"."personnel_id" is
'员工编号';

comment on column "lys"."personnel_train"."train_date" is
'培训日期';

comment on column "lys"."personnel_train"."train_content" is
'培训内容';

comment on column "lys"."personnel_train"."remark" is
'备注';


drop table if exists "lys"."personnel_encouragement" ;

/*==============================================================*/
/* Table: personnel_encouragement                               */
/*==============================================================*/
create table "lys"."personnel_encouragement" (
                                       personnel_id         VARCHAR(10)          not null,
                                       personnel_enc_or_chast_date TIMESTAMP            null,
                                       personnel_enc_or_chast_reason VARCHAR(50)          null,
                                       personnel_enc_or_chast_point VARCHAR(10)          null,
                                       personnel_enc_or_chast_sort VARCHAR(10)          null,
                                       remark               VARCHAR(255)         null,
                                       constraint PK_PERSONNEL_ENCOURAGEMENT primary key (personnel_id)
);

comment on table "lys"."personnel_encouragement" is
'员工奖罚表';

comment on column "lys"."personnel_encouragement"."personnel_id" is
'员工编号';

comment on column "lys"."personnel_encouragement"."personnel_enc_or_chast_date" is
'奖罚日期';

comment on column "lys"."personnel_encouragement"."personnel_enc_or_chast_reason" is
'奖罚原因';

comment on column "lys"."personnel_encouragement"."personnel_enc_or_chast_point" is
'奖罚分';

comment on column "lys"."personnel_encouragement"."personnel_enc_or_chast_sort" is
'奖罚类别';

comment on column "lys"."personnel_encouragement"."remark" is
'备注';


drop table if exists "lys"."personnel_appraise" ;

/*==============================================================*/
/* Table: personnel_appraise                                    */
/*==============================================================*/
create table "lys"."personnel_appraise" (
                                  personnel_id         VARCHAR(10)          not null,
                                  appraise_date        TIMESTAMP            null,
                                  appraise_result      VARCHAR(10)          null,
                                  appraise_content     VARCHAR(100)         null,
                                  remark               VARCHAR(255)         null,
                                  constraint PK_PERSONNEL_APPRAISE primary key (personnel_id)
);

comment on table "lys"."personnel_appraise" is
'员工评价表';

comment on column "lys"."personnel_appraise"."personnel_id" is
'员工主键';

comment on column "lys"."personnel_appraise"."appraise_date" is
'评价日期';

comment on column "lys"."personnel_appraise"."appraise_result" is
'考评结果';

comment on column "lys"."personnel_appraise"."appraise_content" is
'培训内容';

comment on column "lys"."personnel_appraise"."remark" is
'备注';


drop table if exists  "lys"."personnel_remove" ;

/*==============================================================*/
/* Table: personnel_remove                                      */
/*==============================================================*/
create table "lys"."personnel_remove" (
                                personnel_id         VARCHAR(10)          not null,
                                after_remove_deparment VARCHAR(10)          null,
                                after_remove_job     VARCHAR(10)          null,
                                remove_date          TIMESTAMP            null,
                                remove_reason        VARCHAR(100)         null,
                                remark               VARCHAR(255)         null,
                                constraint PK_PERSONNEL_REMOVE primary key (personnel_id)
);

comment on table "lys"."personnel_remove" is
'员工调动表';

comment on column "lys"."personnel_remove"."personnel_id" is
'员工编号';

comment on column "lys"."personnel_remove"."after_remove_deparment" is
'调后部门';

comment on column "lys"."personnel_remove"."after_remove_job" is
'调后职位';

comment on column "lys"."personnel_remove"."remove_date" is
'调动日期';

comment on column "lys"."personnel_remove"."remove_reason" is
'调动原因';

comment on column "lys"."personnel_remove"."remark" is
'备注';

drop table if exists "lys"."personnel_adjust_salary" ;

/*==============================================================*/
/* Table: personnel_adjust_salary                               */
/*==============================================================*/
create table "lys"."personnel_adjust_salary" (
                                       personnel_id         VARCHAR(10)          not null,
                                       adjust_salary_date   TIMESTAMP            null,
                                       before_adjust_salary INT4                 null,
                                       after_adjust_salary  INT4                 null,
                                       adjust_salary_reason VARCHAR(100)         null,
                                       remark               VARCHAR(255)         null,
                                       constraint PK_PERSONNEL_ADJUST_SALARY primary key (personnel_id)
);

comment on table "lys"."personnel_adjust_salary" is
'员工调薪表';

comment on column "lys"."personnel_adjust_salary"."personnel_id" is
'员工编号';

comment on column "lys"."personnel_adjust_salary"."adjust_salary_date" is
'调薪日期';

comment on column "lys"."personnel_adjust_salary"."before_adjust_salary" is
'调前薪资';

comment on column "lys"."personnel_adjust_salary"."after_adjust_salary" is
'调后薪资';

comment on column "lys"."personnel_adjust_salary"."adjust_salary_reason" is
'调薪原因';

comment on column "lys"."personnel_adjust_salary"."remark" is
'备注';


drop table if exists  "lys"."salary" ;

/*==============================================================*/
/* Table: salary                                                */
/*==============================================================*/
create table "lys"."salary" (
                      personnel_id         VARCHAR(10)          not null,
                      bonus                INT4                 null,
                      lunch_salary         INT4                 null,
                      traffic_salary       INT4                 null,
                      basis_salary         INT4                 null,
                      total                INT4                 null,
                      constraint PK_SALARY primary key (personnel_id)
);

comment on table "lys"."salary" is
'工资表';

comment on column "lys"."salary"."personnel_id" is
'员工编号';

comment on column "lys"."salary"."bonus" is
'奖金';

comment on column "lys"."salary"."lunch_salary" is
'午餐补助';

comment on column "lys"."salary"."traffic_salary" is
'交通补助';

comment on column "lys"."salary"."basis_salary" is
'基本工资';

comment on column "lys"."salary"."total" is
'总工资';


drop table if exists "lys"."op";

/*==============================================================*/
/* Table: op                                                    */
/*==============================================================*/
create table "lys"."op" (
                  popedom              VARCHAR(10)          null,
                  op_id                INT4                 not null,
                  op_name              VARCHAR(50)          null,
                  op_phone             INT8                 not null,
                  op_tele              INT8                 null,
                  op_address           VARCHAR(50)          null,
                  remark               VARCHAR(255)         null,
                  constraint PK_OP primary key (op_id)
);

comment on table "lys"."op" is
'操作员表';

comment on column "lys"."op"."popedom" is
'权限组';

comment on column "lys"."op"."op_id" is
'编号';

comment on column "lys"."op"."op_name" is
'操作员姓名';

comment on column "lys"."op"."op_phone" is
'手机号码';

comment on column "lys"."op"."op_tele" is
'住宅电话';

comment on column "lys"."op"."op_address" is
'联系地址';

comment on column "lys"."op"."remark" is
'备注';


drop table if exists "lys"."operate";

/*==============================================================*/
/* Table: operate                                               */
/*==============================================================*/
create table "lys"."operate" (
                       add_date             TIMESTAMP            null,
                       event                VARCHAR(50)          null,
                       op                   VARCHAR(10)          null
);

comment on table "lys"."operate" is
'操作日志表';

comment on column "lys"."operate"."add_date" is
'添加日期';

comment on column "lys"."operate"."event" is
'事件内容';

comment on column "lys"."operate"."op" is
'操作员';



drop sequence if exists "lys"."user_id_seq";
create sequence "lys"."user_id_seq"
increment 1
minvalue 1
maxvalue 9223372036854775807
start 1
cache 1;


DROP TABLE IF EXISTS "lys"."user";
CREATE TABLE "lys"."user" (
                            "id" int4 NOT NULL default nextval('user_id_seq'::regclass),
                            "name" varchar(50) COLLATE "pg_catalog"."default" NOT NULL,
                            "password" varchar(100) COLLATE "pg_catalog"."default" NOT NULL,
                            "create_time" timestamp(6),
                            "update_time" timestamp(6)
)
;
COMMENT ON COLUMN "lys"."user"."name" IS '用户名';
COMMENT ON COLUMN "lys"."user"."password" IS '密码';
COMMENT ON COLUMN "lys"."user"."create_time" IS '创建时间';
COMMENT ON COLUMN "lys"."user"."update_time" IS '更新时间';
