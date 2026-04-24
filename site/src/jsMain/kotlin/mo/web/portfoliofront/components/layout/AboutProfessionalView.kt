package mo.web.portfoliofront.components.layout

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.silk.components.icons.fa.FaLocationDot
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import mo.web.portfoliofront.components.SectionHeader
import mo.web.portfoliofront.components.sections.ContactResume
import mo.web.portfoliofront.components.widgets.BridgeAscii
import mo.web.portfoliofront.components.widgets.SectionLink
import mo.web.portfoliofront.infrastructure.models.KeyEvent
import mo.web.portfoliofront.infrastructure.models.SkillCategory
import mo.web.portfoliofront.infrastructure.models.TechnicalSkill
import mo.web.portfoliofront.utility.CONSTANTS
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Hr
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul

@Composable
fun AboutProfessionalView(
    isTransitioning: Boolean
) {
    val fadeClass = if (isTransitioning) "u-fade u-fade--hidden" else "u-fade"
    val fadeList = fadeClass.split(" ").toTypedArray()

    Section(attrs = { classes(*fadeList, "about-intro-paragraph") }) {
        P(attrs = { classes("about-paragraph") }) {
            Text("")
        }
        P(attrs = { classes("about-paragraph") }) {
            Text("" +
                    "I'm a full-stack web developer focused on building practical, reliable, and efficient web apps. " +
                    "My background in teaching, customer service and IT helped build my problem-solving and communication skills. " +
                    "I am always improving my craft and bring a strong work ethic, curiosity, and collaborative approach to every team I'm with.")
        }
    }

    Section(attrs = { classes(*fadeList, "about-location-section", "sec-pad") }) {

        Div(attrs = { classes("about-location-header")}) {
            Div(attrs =  { classes("about-ascii-art") }) {
                BridgeAscii()
            }

            P({ classes("about-subtitle") }) {
                Text("Based In ")
                FaLocationDot(modifier = Modifier.margin(left = 2.px), size = IconSize.XS)
            }
            H2({ classes("about-title") }) {
                Text("San Francisco, California")
            }

            P(attrs = { classes("about-paragraph") }) {
                Text("I've always admired San Francisco. The ocean side peninsula with rolling hills and bridges connecting worlds together. ")

            }

            P(attrs = { classes("about-paragraph") }) {
                Text("I knew one day I'd create a story here - and here I am. The city has been great to me and blessed me with many opportunities and memories. ")
            }

            P(attrs = { classes("about-paragraph") }) {
                Text("Here are some of those key events: ")
            }
        }
    }


    Section(attrs = { classes(*fadeList, "about-events-section", "sec-pad") }) {
        H2({
            id("events")
            classes("section-header")
        }) {
            Text("Key Events and Opportunities")
        }
        Hr()

        KeyEventsSection()
    }

    Section(attrs = { classes(*fadeList, "about-events-section", "sec-pad") }) {
        H2({
            id("skills")
            classes("section-header")
        }) {
            Text("Technical Skills")
        }
        Hr()

        TechnicalSkillsSection()

        SectionLink(
            path = "/projects",
            text = "view the results of these skills",
            hoverText = "/projects"
        )
    }

    Section(attrs = { classes("contact-section", "content-section", "sec-pad") }) {
        SectionHeader(title = "Contact & Resume")
        Hr()

        ContactResume()
    }

}

// Key Events Section

@Composable
fun KeyEventsSection() {
    Ul( attrs = { classes("about-key-list") } ) {
        KEY_EVENTS
            .take(CONSTANTS.KEY_EVENTS_TOTAL_PREVIEW)
            .forEach { event ->
                Li({ classes("about-key-item")} ) {
                    Span { Text(event.date) }
                    H3 { Text(event.title) }
                    P { Text(event.description)}
                }
            }
    }
}

// Technical Skills Section

@Composable
fun TechnicalSkillsSection() {
    var activeCategory by remember { mutableStateOf<SkillCategory?>(null) }

    val filtered = if (activeCategory == null) SKILLS_LIST
    else SKILLS_LIST.filter { it.category == activeCategory }

    // Category filter chips
    Div(attrs = { classes("skill-filter-tabs") }) {
        Div(attrs = {
            classes("project-filter-chip")
            if (activeCategory == null) classes("active")
            onClick { activeCategory = null }
        }) { Text("All") }

        SkillCategory.entries.forEach { cat ->
            Div(attrs = {
                classes("project-filter-chip")
                if (activeCategory == cat) classes("active")
                onClick { activeCategory = if (activeCategory == cat) null else cat }
            }) { Text(cat.label) }
        }
    }

    // Skill chips row
    Div(attrs = { classes("skill-chips-row") }) {
        filtered.forEach { skill ->
            Div(attrs = { classes("skill-chip") }) {
                skill.iconUrl?.let { url ->
                    Img(src = url, alt = skill.name, attrs = { classes("skill-chip-icon") })
                }
                Span(attrs = { classes("skill-chip-name") }) { Text(skill.name) }
            }
        }
    }
}

// Data

val KEY_EVENTS = listOf(
    KeyEvent(
        "March, 2024 - Current", "Full-Stack Engineer at Green Rebates",
        description = "Developed internal tools and SEO-optimized web platforms using Kotlin (Ktor/Kobweb), React, and PostgreSQL, while managing production deployments and integrating analytics, authentication, and automation systems."
    ),
    KeyEvent(
        "June, 2023 – May, 2024", "Lead Instructor at Mission Bit",
        description = "Led web development instruction in HTML, CSS, and JavaScript while designing workshops and guiding students through capstone projects that earned recognition."
    ),
    KeyEvent(
        "May, 2023", "Graduated from University of San Francisco",
        description = "Earned a Bachelor of Science in Computer Science, culminating in the development of a full-stack web application as a capstone project."
    ),
    KeyEvent(
        "August, 2022 – May, 2023", "Help Desk Technician at University of San Francisco",
        description = "Provided frontline technical support for hardware and software issues and acted as a key responder during a campus-wide outage, helping restore critical infrastructure."
    )
)

val SKILLS_LIST = listOf(
    // - Languages
    TechnicalSkill("Kotlin", SkillCategory.LANGUAGE, "/icons/Kotlin.svg"),
    TechnicalSkill("JavaScript", SkillCategory.LANGUAGE, "https://cdn.simpleicons.org/javascript"),
    TechnicalSkill("TypeScript", SkillCategory.LANGUAGE, "https://cdn.simpleicons.org/typescript"),
    TechnicalSkill("Python", SkillCategory.LANGUAGE, "https://cdn.simpleicons.org/python"),
    TechnicalSkill("HTML", SkillCategory.LANGUAGE, "https://cdn.simpleicons.org/html5"),
    TechnicalSkill("CSS", SkillCategory.LANGUAGE, "https://cdn.simpleicons.org/css"),
    TechnicalSkill("SQL", SkillCategory.LANGUAGE, null), // TODO: need icon

    // - Frameworks & Libraries
    TechnicalSkill("React", SkillCategory.FRAMEWORK, "https://cdn.simpleicons.org/react"),
    TechnicalSkill("Next.js", SkillCategory.FRAMEWORK, "https://cdn.simpleicons.org/nextdotjs/ffffff"),
    TechnicalSkill("Ktor", SkillCategory.FRAMEWORK, "/icons/ktor.svg"),
    TechnicalSkill("Kobweb", SkillCategory.FRAMEWORK, "/icons/kobweb.svg"),
    TechnicalSkill("Bootstrap", SkillCategory.FRAMEWORK, "/icons/Bootstrap.svg"),

    // - Databases & Data
    TechnicalSkill("PostgreSQL", SkillCategory.DATABASE, "/icons/psql.svg"),
    TechnicalSkill("MongoDB", SkillCategory.DATABASE, "/icons/mongodb.svg"),
    TechnicalSkill("Supabase", SkillCategory.DATABASE, "https://cdn.simpleicons.org/supabase"),
    TechnicalSkill("PocketBase", SkillCategory.DATABASE, "/icons/pocketbase.svg"),
    TechnicalSkill("jOOQ", SkillCategory.DATABASE, "/icons/jooq.png"),

    // - Tools
    TechnicalSkill("Git", SkillCategory.TOOL, "https://cdn.simpleicons.org/git"),
    TechnicalSkill("Docker", SkillCategory.TOOL, "https://cdn.simpleicons.org/docker"),
    TechnicalSkill("Node.js", SkillCategory.TOOL, "https://cdn.simpleicons.org/nodedotjs"),
    TechnicalSkill("Gradle", SkillCategory.TOOL, "https://cdn.simpleicons.org/gradle"),
    TechnicalSkill("IntelliJ IDEA", SkillCategory.TOOL, "https://cdn.simpleicons.org/intellijidea"),
    TechnicalSkill("VS Code", SkillCategory.TOOL), // TODO: need icon

    // - Soft Skills
    TechnicalSkill("Communication", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Problem Solving", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Teaching & Mentorship", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Technical Troubleshooting", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Team Collaboration", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Adaptability", SkillCategory.SOFT_SKILL),
    TechnicalSkill("Time Management", SkillCategory.SOFT_SKILL),
)
