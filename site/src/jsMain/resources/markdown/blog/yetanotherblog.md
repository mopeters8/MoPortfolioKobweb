---
title: Yet Another Blog..
subtitle: I keep making these, but don't make the blog posts!
created: 2025-04-24
readtime: 10
blogType: Programming
---

## I Know.. I know..

Not that I have had many blog visitors, but family if you are reading this - I am sorry for making you checkout 3 different blog sites. Maybe i'm done now, but we all know how programmers can be...

# Blog Site '#1'

This first one was made following a tutorial on Kobweb. It was a decent attempt, and following a tutorial helped by showing me new ways to achieve things in Kobweb, and web dev in general.
What I didn't like the was the self-made dashboard for adding new blogs. It was nice to have my own creation area, but with me only being one user it felt like I had to maintain the code for uploading blogs and the blogs themselves.
Felt a little overkill having all this fancy auth, when things like Pocketbase or Kobweb's markdown support just make things easy to start creating and typing. The tutorial also called for using
Kobweb's built-in backend, and with it's limited support also clashing with my better understanding of Ktor, it just felt forced to me. I wanted to use things I felt comfortable with.

Tutorials are great, but they funnel you into that creators view, methodologies, and idea for the whole project. I wanted different features on my posts and creation flow - so that meant uprooting what the tutorial provided, and
introducing my own style. Totally possible, probably smart, however it didn't feel nice to me and I wanted to learn something new. My new requirements were:
- No SPA (I want this to potentially be crawled)
- Easier addition of content (Limit pain points for my lazy a** to avoid working/creating)
- Easily adaptable to new things being put into blogs.
- My own style for the whole site.

# Blog Site '#2'

All custom-made version, no tutorial with slightly smaller stack (kinda?). My solution to SSR (for crawlers) was to simply have my routes return actual HTML, no SPA stuff. I already use Ktor, so figured just return it like that. With a recent discover of HTMX, I wanted to give that a shot as well.
I was able to go back to traditional css, and not Kobweb's styling so that felt nice to try out again, and on top of Kotlin

I utilized:
- Pocket Base
- Ktor Backend (To cache, have stronger backend control)
- Kotlin Typesafe HTML DSL
- HTMX - very limited, but helped for loading more.

It was rad to set up Pocketbase, as their documentation for installation made it super easy. After that, creating my blog posts was incredibly easy with their built-in API generators.
I didn't need to set up a thing on that front, however I noticed how slow sometimes it would be when my frontend went to fetch from Pocketbase. I built an 'in-backend' cache that would fetch my latest posts few times everyday.
The idea was that since I barely upload new blogs, It wouldn't be the worst thing if my new blog doesn't show for a few hours. What I had ready was the list of blogs, ready to serve on each web page.

I usually make my sites with Kobweb, but since I wanted these blog posts to possibly be crawled, found for Google - I didn't want to fetch/async load blog posts to a frontend. 
I wanted them immediately available in the HTML that gets returned to a request. I am aware some crawlers can do SPA's and frontend JS, but the overall feel of a server side rendered page too was unique to me - and I wanted to try that out.
Not a terrible experience, and I'd like to find another project like that.

# Blog Site (Section?) '#3'

That brings us to here. This whole portfolio, self site, is made with Kobweb. Kobweb supports SSG, so while it is a SPA - if my content is here it gets rendered and put into those html files for given pages.
While is a SPA, this SSG allows me to have things like my blogs still be crawled. While Kobweb still loads a kobweb.js file to get the site running, the generated HTML still has the content inside. It isn't just a single index.html file with Kobweb in
this scenario. 

Combine that with Kobweb's Markdown support, and my own markdown layout, I am able to make my blog posts in Markdown and have them 'hardcoded' in my site files. Results are now these can be crawled, no separate repository or service for my posts.
Solid fast loading, and viewability for these is great.

## Why Though?

Again, I understand no one probably cares what I have to write about, but it's still a place to be creative and share my thoughts. I could always go share my ideas on existing platforms, but having a place that is mine, styled to my preferences makes it feel so much more personal.
Anyone who is into arts, crafts, developing, engineering can probably understand. I like to self-host, and when I know I control something it feels much better.

I want to write about the things im learning in this field, and personal things. My whole thought process with this blog here, and this site in general is that I want to share WHO I AM. If these blogs, or my things turn you away,
then we probably wouldn't make good friends or coworkers. I hope anyone reading this continues to keep an open mind, stay being curious and accepting of other's ideas and creations.