package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Blog

// BLOG_LIST is generated at build time from markdown files.
// Source: src/jsMain/resources/markdown/blog/*.md
// Generated output: mo/web/portfoliofront/infrastructure/data/BlogList.kt
//
// Front matter fields required per post:
//   title     — display title
//   subtitle  — one-line description shown in blog rows
//   created   — YYYY-MM-DD
//   readtime  — integer (minutes)
//   blogType  — one of: Technology, Gaming, Programming, Life  (defaults to Life)

val BLOG_LIST = BLOG_GENERATED_LIST