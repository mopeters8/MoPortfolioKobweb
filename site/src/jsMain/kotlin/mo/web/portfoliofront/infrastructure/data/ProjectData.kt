package mo.web.portfoliofront.infrastructure.data

import mo.web.portfoliofront.infrastructure.models.Project
import mo.web.portfoliofront.infrastructure.models.ProjectImage
import mo.web.portfoliofront.infrastructure.models.ProjectLink
import mo.web.portfoliofront.infrastructure.models.Technologies

val FEATURED_PROJECT: Project = Project(
    title = "Goal Blogs",
    description = "Social platform to track your goals and share your experiences and accomplishments with others.",
    overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
    linkInfo = ProjectLink(
        presentation = "GoalBlogs.com",
        url = "https://goalblogs.com"
    ),
    date = "November 2025",
    imageURLs = listOf(
        ProjectImage(src = "https://i.postimg.cc/W3d6z2d4/Goal-Blog-Mo.png", alt = "GoalBlogMo's Profile"),
        ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs"),
        ProjectImage(src = "https://i.postimg.cc/W3d6z2dN/Goal-Blog-Rory.png", alt = "Rory's Recipes")
    ),
    technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ, Technologies.BOOTSTRAP),
    features = listOf(
        "Personalized profiles to house and track your list of goals.",
        "Various goal types and visibilities, to make sure you are able to track your progress effectively.",
        "Likes and favorites to keep track of others goals you appreciate."
    ),
    challenges = listOf(
        "Security and Auth, as it's still relatively new to me.",
        "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."
    ),
    experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
)

/*
    Rules: Number 1 on the list is the featured project.
    - Makes it easier later to slide down the rest when a new featured project is added.
 */
val PROJECTS_LIST: List<Project> = listOf(

    Project(
        title = "FDC Disc Golf Club",
        description = "Our Disc Golf Club's main website. Here we share latest videos, update our tag leaderboard and keep up to date with our rules.",
        overview = "Using Discord's OAuth, we connected our Club Discord and Club website together. Only verified FDC members are allowed to login to update the sites leaderboards, rules, etc. We wanted a main home base for our club rules, videos, socials links and more. Telling others on the course about our club has never been easier now that we can give them the simple fdcdisc.golf url!",
        linkInfo = ProjectLink(presentation = "FDCDisc.golf", url = "https://fdcdisc.golf"),
        date = "September 2025",
        imageURLs = listOf(
            ProjectImage(src = "https://i.postimg.cc/VNGWzSLT/FDCHome.png", alt = "Home page for FDC Club's Site"),
            ProjectImage(src = "https://i.postimg.cc/261Fyz1Y/FDCLeaderboard.png", alt = "Club Leaderboard"),
            ProjectImage(src = "https://i.postimg.cc/d1gRTzCL/FDCLatest.png", alt = "FDC Site's Latest news")
        ),
        technologies = listOf(
            Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ,
            Technologies.DISCORD),
        features = listOf(
            "Club Tag Leaderboard adjustment, to keep track of the current tag order for competition.",
            "Utilization of a PDGA verified discs API, allowing us to expose ourselves to discs we don't use or know about, with links to purchase it.",
            "View latest posts on our youtube. From clips of the weeks, to tournament recaps.",
            "Houses our club's rules for an easy place for all members to check."
        ),
        challenges = listOf(
            "Discord OAuth. While they make it simple to setup, especially with their developer portal it was my first REAL experience implementing it.",
            "Caching YouTube video results, and PDGA Disc API. I don't want to spam either one, so creating my own cache was necessary. Updates data via timed services.",
            "Incorporating feedback, and collecting issues. Luckily we have plenty of awesome members giving their thoughts, so organizing and getting consensus is an important skill I must learn for improving any platform I create."
        ),
        experience = "Creating a site/webapp for a personalized use, especially one others close to me will get use out of us is extremely fun. Not only do I get to work on something that'll enhance another hobby, but I get to practice my profession while doing it."
    ),

    Project(
        title = "FDC Card Game",
        description = "Simple card game to augment and enhance a regular disc golf round.",
        overview = "Battle your card members with a card game that grants abilities and power ups to get that competitive edge or useful items to handicap your opponents.",
        linkInfo = ProjectLink(presentation = "cards.FDCDisc.golf", url = "https://cards.FDCDisc.golf"),
        date = "October 2025",
        imageURLs = listOf(
            ProjectImage(src = "https://i.postimg.cc/KYqDmKv0/FDCCard-Home.png", alt = "Home page for FDC Card Game"),
            ProjectImage(src = "https://i.postimg.cc/YSnzt4q8/FDCCard-Game-Card.png", alt = "Card for FDC Card Game"),
            ProjectImage(src = "https://i.postimg.cc/6QjfB75Y/FDCCard-Game.png", alt = "User's round deck for FDC Card Game")
        ),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.BOOTSTRAP),
        features = listOf(
            "Power cards for user's to aid in their game. Attack cards to combat your card mates. Group goals for a common enemy and card pride.",
            "Settings to tune and adjust a round to player's preference.",
            "Randomizer dice to randomize what throw, stance and disc one must use."
        ),
        challenges = listOf(
            "Creating fun cards that will enhance a disc golf game and allow for both recipient and attacker to have fun. Since this is a game, game balance is required and can be very difficult and tricky. Very first play session, we had some cardmates that were not too happy, so tuning is a challenge one must always go through with games.",
            "How to layout a game. I had the idea, but actually creating a UI/UX that helps with phones in the middle of a round was tricky, and crafted with lots of feedback."
        ),
        experience = "It was fun creating this game idea through a few weekends. As you can see on the rest of this site, I love my games so I took a chance to try to create a game for fun with people I know would play with me. While it's simply static site files, no backend, and utilized bootstrap for styling, the hardest part was actually designing a game that is fun for people to play."
    ),

    Project(
        title = "This Portfolio",
        description = "Portfolio or personal site dedicated to me, myself and I.",
        overview = "Developers need a place to show off their creations, their skills and most importantly themselves. While I think my projects are interesting, I believe it's also important to see who I am outside of the IDE. By showing all my interests and hobbies outside of work, I hoped to show how I can be a friend and more importantly a valued teammate.",
        linkInfo = ProjectLink(presentation = "owen-peters.com", url = "https://www.owen-peters.com"),
        date = "April 2026",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/1t8cX98X/Mo-Portfolio.png", alt = "Home page for this portfolio.")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf(
            "Site Design - I took many examples from other's portfolios. While I don't think I am bad at design, crating something to represent a person was a little tricker than say a company.",
            "Finding content to add - I have many projects to show, but with their limited scope or personal using them it's hard to understand if it's worth to show. Including my blog, games, and photos it's been difficult but as I get more into a groove of what I want to share with the world, it will only get easier."
        ),
        experience = "My experiences with Kobweb allowed me to hit the ground running on this project. Since the site will feature no backend, it was easy enough to get started. Crafting something that is about myself was weird at first, but now that my vision is more realized I am excited to upload and share more things I enjoy in my life."
    ),

    Project(
        title = "Braun Equipment",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),


    Project(
        title = "Old Mo Blog #1",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Old Mo Blog #2",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "ICYLeds.com",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),

    Project(
        title = "Greenrebates.com",
        description = "Social platform to track your goals and share your experiences and accomplishments with others.",
        overview = "Goal Blogs is a social platform designed to help users track their goals and share their experiences and accomplishments with others. The platform allows users to create personalized profiles where they can list their goals, categorize them by type and visibility, and share updates on their progress. Users can also interact with each other's goals through likes and favorites, fostering a supportive community focused on personal growth and achievement.",
        linkInfo = ProjectLink(presentation = "GoalBlogs.com", url = "https://goalblogs.com"),
        date = "November 2025",
        imageURLs = listOf(ProjectImage(src = "https://i.postimg.cc/bwYyhpXH/goalblogs-home.png", alt = "Home page for Goal Blogs")),
        technologies = listOf(Technologies.KOTLIN, Technologies.KOBWEB, Technologies.KTOR, Technologies.JOOQ),
        features = listOf("Personalized profiles to house and track your list of goals.", "Various goal types and visibilities, to make sure you are able to track your progress effectively.", "Likes and favorites to keep track of others goals you appreciate."),
        challenges = listOf("Security and Auth, as it's still relatively new to me.", "Scaling up an app with more features, making sure to keep both frontend and backend organized and in sync with updates."),
        experience = "Testing out the experience of building a full stack app with Kotlin, using Ktor for the backend and Kobweb for the frontend. It's been a great learning experience so far, and I'm excited to continue improving and adding features to the app as I learn more about both technologies."
    ),
)
